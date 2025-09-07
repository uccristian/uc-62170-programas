package programasSemana03.herenciaabstractavehiculo;

public class Tren extends Vehiculo {
    private static final float PORCE_DEP = 0.45f;

    public Tren(float precioInicial) {
        super(precioInicial, PORCE_DEP);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== TREN ===");
        System.out.println("Precio Inicial: " + precioInicial);
        System.out.println("Monto depreciacion: " + montoDepreciacion);
        System.out.println("Precio total: " + precioFinal);
    }
}
