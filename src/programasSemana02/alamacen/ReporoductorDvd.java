package programasSemana02.alamacen;

public class ReporoductorDvd {
    private Producto producto;
    private String marca;
    private String modelo;
    private float porcentajeDescuento;

    public ReporoductorDvd(Producto producto, String marca, String modelo, float porcentajeDescuento) {
        this.producto = producto;
        this.marca = marca;
        this.modelo = modelo;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public void devolverDatosReprod() {
        producto.devolverDatosProd();
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
    }

    public void devolverPrecioVentaReprod() {
        System.out.println("Precio venta: " + (producto.devolverCostoProd() * porcentajeDescuento));
    }
}
