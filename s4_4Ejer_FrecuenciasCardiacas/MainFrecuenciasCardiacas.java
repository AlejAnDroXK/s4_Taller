package s4.s4_4Ejer_FrecuenciasCardiacas;

import javax.swing.*;

public class MainFrecuenciasCardiacas {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su primer nombre:");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido:");
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de nacimiento:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de nacimiento:"));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de nacimiento:"));

        FrecuenciasCardiacas p = new FrecuenciasCardiacas(nombre, apellido, dia, mes, anio);

        int edad = p.calcEdad();
        int freqMax = p.freqMaxima();
        String rango = p.freqEsperada();
        String mensaje = String.format(
                "%s\n\n" +
                        "Edad: %d años\n" +
                        "La frecuencia cardíaca máxima es de: %d pulsos/minuto\n" +
                        "Frecuencia cardíaca esperadaes de: %s",
                p.info(), edad, freqMax, rango
        );

        JOptionPane.showMessageDialog(null, mensaje, "Frecuencias Cardíacas", JOptionPane.INFORMATION_MESSAGE);
    }
}
