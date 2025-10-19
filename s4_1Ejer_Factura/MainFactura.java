package s4.s4_1Ejer_Factura;
import javax.swing.JOptionPane;

public class MainFactura {
    public static void main(String[] args) {
        String numeroPieza = JOptionPane.showInputDialog("Ingrese el número de pieza:");
        String descripcionPieza = JOptionPane.showInputDialog("Ingrese la descripción de la pieza:");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de artículos:"));
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio por artículo:"));

        Factura factura = new Factura(numeroPieza, descripcionPieza, cantidad, precio);

        String mensaje = String.format(
                "Factura:\nNúmero de pieza: %s" +
                        "\nDescripción: %s" +
                        "\nCantidad: %d" +
                        "\nPrecio por artículo: %.2f" +
                        "\nMonto total: %.2f",
                factura.getNumpieza(),
                factura.getDescpieza(),
                factura.getCantidad(),
                factura.getPrecio(),
                factura.obtenerMontoFactura()
        );

        JOptionPane.showMessageDialog(null, mensaje, "Detalles de la Factura", JOptionPane.INFORMATION_MESSAGE);
    }
}
