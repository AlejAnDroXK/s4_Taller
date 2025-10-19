package s4.s4_2Ejer_Empleado;

public class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private double salario;
    //Constructor
    public Empleado(String primerNombre, String apellidoPaterno, double salario) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        if (salario > 0.0){
            this.salario = salario;
        }else {
            this.salario = 0.0;
        }
    }
    //get
    public String getPrimerNombre() {
        return primerNombre;
    }
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public double getSalario() {
        return salario;
    }
    //set
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    //metodos
    public double calcularSalario() {
        return salario*12;
    }
    public void aumento(double aumento) {
        salario= salario+(salario*aumento/100);
    }
}
