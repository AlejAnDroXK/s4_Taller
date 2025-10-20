package s4.empleado;

import javax.swing.*;

public class MainEmpleado {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su primer nombre");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario"));

        String nombre1 = JOptionPane.showInputDialog("Ingrese su primer nombre");
        String apellido1 = JOptionPane.showInputDialog("Ingrese su apellido");
        double salario1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario"));

        Empleado e1 = new Empleado(nombre, apellido, salario);
        Empleado e2 = new Empleado(nombre1, apellido1, salario1);

        String mensaje = String.format(
                "El salario anual del empleado %s %s es de: %.2f \n " +
                        "El salario anual del empleado %s %s es de: %.2f",
                e1.getPrimerNombre(),e1.getApellidoPaterno(),e1.calcularSalario(),
                e2.getPrimerNombre(),e2.getApellidoPaterno(),e2.calcularSalario()
        );
        JOptionPane.showMessageDialog(null, mensaje, "Sueldo anual empleados", JOptionPane.INFORMATION_MESSAGE);

        e1.aumento(10);
        e2.aumento(10);

        String mensaje1 = String.format(
                "El salario anual del empleado %s %s con un 10%% de aumento es de: %.2f \n " +
                "El salario anual del empleado %s %s con un 10%% de aumento es de: %.2f",
                e1.getPrimerNombre(),e1.getApellidoPaterno(),e1.calcularSalario(),
                e2.getPrimerNombre(),e2.getApellidoPaterno(),e2.calcularSalario()
        );

        JOptionPane.showMessageDialog(null, mensaje1, "Sueldo anual con aumento", JOptionPane.INFORMATION_MESSAGE);

    }
}
