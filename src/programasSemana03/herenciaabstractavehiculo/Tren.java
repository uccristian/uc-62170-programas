package programasSemana03.herenciaabstractavehiculo;

public class Tren extends Vehiculo {
    private final float PORCE_DEP = 0.45f;

    public Tren(float precio) {
        precioInicial = precio;
        montoDepre = precioInicial * PORCE_DEP;
    }

    public void Mostrar() {
        System.out.println("=== TREN ===");
        System.out.println("Precio Inicial: " + precioInicial);
        System.out.println("Monto depreciacion: " + montoDepre);
        System.out.println("Precio total: " + calcularPrecioFinal());
    }

    @Override
    public float calcularPrecioFinal() {
        total = precioInicial - montoDepre;
        return total;
    }
}
