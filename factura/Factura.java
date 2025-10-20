package s4.factura;

public class Factura {
    //Variables
    private String numpieza;
    private String descpieza;
    private int cantidad;
    private double precio;
    //Constructor
    public Factura(String numpieza, String descpieza, int cantidad, double precio) {
        this.numpieza = numpieza;
        this.descpieza = descpieza;
        if (cantidad > 0){
            this.cantidad = cantidad;
        }else{
            this.cantidad = 0;
        }

        if (precio > 0.0){
            this.precio = precio;
        }else{
            this.precio = 0.0;
        }
    }
    public Factura() {}
    //Get
    public String getDescpieza() {
        return descpieza;
    }
    public String getNumpieza() {
        return numpieza;
    }
    public int getCantidad() {
        return cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    //Set
    public void setNumpieza(String numpieza) {
        this.numpieza = numpieza;
    }
    public void setDescpieza(String descpieza) {
        this.descpieza = descpieza;
    }
    public void setCantidad(int cantidad) {
        if (cantidad > 0.0){
            this.cantidad = cantidad;
        }else{
            this.cantidad = 0;
        }
    }
    public void setPrecio(double precio) {
        if (precio > 0.0){
            this.precio = precio;
        }else{
            this.precio = 0.0;
        }
    }
    public double obtenerMontoFactura(){
        return cantidad * precio;
    }
}
