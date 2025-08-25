package programasSemana02.boleta;

public class BoletaVenta {
    private final String NombreCliente;
    private final String NumBoleta;
    private final int Cantidad;
    private final double Precio;
    private final double MontoTotal;

    public BoletaVenta(int Cantidad, String NombreCliente, String NumBoleta, double Precio) {
        this.Cantidad = Cantidad;
        this.NombreCliente = NombreCliente;
        this.NumBoleta = NumBoleta;
        this.Precio = Precio;
        this.MontoTotal = Precio * Cantidad;
    }

    public void Mostrar() {
        System.out.println("Nombre cliente: " + NombreCliente);
        System.out.println("Numero boleta: " + NumBoleta);
        System.out.println("Cantidad: " + Cantidad);
        System.out.println("Precio: " + Precio);
        System.out.println("Monto total: " + MontoTotal);
    }
}
