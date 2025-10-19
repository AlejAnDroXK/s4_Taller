package s4.s4_4Ejer_FrecuenciasCardiacas;

import java.time.LocalDate;
import java.time.Period;

public class FrecuenciasCardiacas {
    private String nombre;
    private String apellido;
    private int dia;
    private int mes;
    private int anio;

    public FrecuenciasCardiacas(String nombre, String apellido, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    //set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    //get
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAnio() {
        return anio;
    }
    public int calcEdad() {
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        LocalDate hoy = LocalDate.now();
        return Period.between(fechaNacimiento, hoy).getYears();
    }
    public int freqMaxima() {
        return 220 - calcEdad();
    }
    public String freqEsperada() {
        double max = freqMaxima();
        double rangoMin = max * 0.50;
        double rangoMax = max * 0.85;
        return String.format("Entre %.0f y %.0f pulsos por minuto", rangoMin, rangoMax);
    }
    public String info() {
        return String.format(
                "Nombre: %s %s\nFecha de nacimiento: %02d/%02d/%04d", nombre, apellido, dia, mes, anio
        );
    }
}
