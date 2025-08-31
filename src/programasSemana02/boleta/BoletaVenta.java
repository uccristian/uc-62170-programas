package programasSemana02.boleta;

public class BoletaVenta {
    private String NombreCliente;
    private String NumBoleta;
    private int Cantidad;
    private double Precio;
    private double MontoTotal;

    public BoletaVenta() {
    }

    public void registrar(int Cantidad, String NombreCliente, String NumBoleta, double Precio) {
        this.Cantidad = Cantidad;
        this.NombreCliente = NombreCliente;
        this.NumBoleta = NumBoleta;
        this.Precio = Precio;
        this.MontoTotal = Precio * Cantidad;
    }

    public void mostrar() {
        System.out.println("Nombre cliente: " + NombreCliente);
        System.out.println("Numero boleta: " + NumBoleta);
        System.out.println("Cantidad: " + Cantidad);
        System.out.println("Precio: " + Precio);
        System.out.println("Monto total: " + MontoTotal);
    }
}
