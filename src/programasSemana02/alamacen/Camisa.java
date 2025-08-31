package programasSemana02.alamacen;

public class Camisa {
    private Producto producto;
    private String talla;
    private String color;
    private double precioVenta;

    public Camisa(Producto producto, String talla, String color, double precioVenta) {
        this.producto = producto;
        this.talla = talla;
        this.color = color;
        this.precioVenta = precioVenta;
    }

    public void devolverDatosCamisa() {
        producto.devolverDatosProd();
        System.out.println("Talla: " + this.talla);
        System.out.println("Color: " + this.color);
    }

    public void devolverPrecioVentaCamisa() {
        System.out.println("Precio Venta: " + this.precioVenta);
    }
}
