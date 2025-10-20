package s4.perfilmedico;

import java.time.LocalDate;
import java.time.Period;

public class PerfilMedico {
    private String nombre;
    private String apellido;
    private String sexo;
    private int dia;
    private int mes;
    private int anio;
    private double altura;
    private double peso;

    public PerfilMedico(String nombre, String apellido, String sexo, int dia, int mes, int anio, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.altura = altura;
        this.peso = peso;
    }
    //set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
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
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    //get
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getSexo() {
        return sexo;
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
    public double getAltura() {
        return altura;
    }
    public double getPeso() {
        return peso;
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
    public double masaCorporal() {
        double alturaMetros = altura / 100;
        return peso / (alturaMetros * alturaMetros);
    }
    public String tablaBMI() {
        return "VALORES DE BMI\n" +
                "Bajo peso: menos de 18.5\n" +
                "Normal: entre 18.5 y 24.9\n" +
                "Sobrepeso: entre 25 y 29.9\n" +
                "Obeso: 30 o más";
    }
    public String info() {
        return String.format(
                "Nombre: %s %s\n" +
                        "Fecha de nacimiento: %02d/%02d/%04d \n" +
                        "nAltura: %.1f cm\nPeso: %.1f kg",
                nombre, apellido, dia, mes, anio,altura,peso
        );
    }
}
