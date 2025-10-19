package s4.s4_3Ejer_Fecha;
import javax.swing.JOptionPane;

public class MainFecha {
    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes:"));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el anio:"));
        Fecha f = new Fecha(dia, mes, anio);
        JOptionPane.showMessageDialog(null, "Fecha: " + f.mostrarFecha(),"Fecha",JOptionPane.INFORMATION_MESSAGE);
    }
}
