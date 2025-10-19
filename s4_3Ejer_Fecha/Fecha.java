package s4.s4_3Ejer_Fecha;

public class Fecha {
    private int mes;
    private int dia;
    private int anio;
    public Fecha(int mes, int dia, int anio) {
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }
    //get
    public int getMes() {
        return mes;
    }
    public int getAnio() {
        return anio;
    }
    public int getDia() {
        return dia;
    }
    //set
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public String mostrarFecha(){
        return  dia + "/" + mes + "/" + anio;
    }
}
