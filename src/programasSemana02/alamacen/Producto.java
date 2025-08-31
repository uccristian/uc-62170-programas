package programasSemana02.alamacen;

public class Producto {
    private String codigo;
    private String nombre;
    private double precio;

    public Producto() {}

    public Producto(String nombre, String codigo, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }

    public void devolverDatosProd() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nombre: " + this.nombre);
    }

    public double devolverCostoProd() {
        return precio;
    }
}
