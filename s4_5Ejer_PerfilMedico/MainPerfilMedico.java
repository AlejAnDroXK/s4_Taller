package s4.s4_5Ejer_PerfilMedico;

import javax.swing.*;

public class MainPerfilMedico {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su primer nombre:");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido:");
        String sexo = JOptionPane.showInputDialog("Ingrese su sexo:");
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de nacimiento:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de nacimiento:"));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de nacimiento:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura en centímetros:"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso en kilogramos:"));

        PerfilMedico p = new PerfilMedico(nombre, apellido, sexo, dia, mes, anio, altura, peso);

        int edad = p.calcEdad();
        double bmi = p.masaCorporal();
        int freqMax = p.freqMaxima();
        String rangoFreq = p.freqEsperada();

        String mensaje = String.format(
                "%s\n\nEdad: %d años\n" +
                        "BMI: %.1f\n" +
                        "Frecuencia cardíaca máxima: %d pulsos/minuto\n" +
                        "Rango frecuencia esperada: %s\n\n%s",
                p.info(), edad, bmi, freqMax, rangoFreq, p.tablaBMI()
        );

        JOptionPane.showMessageDialog(null, mensaje, "Perfil Médico", JOptionPane.INFORMATION_MESSAGE);
    }
}
