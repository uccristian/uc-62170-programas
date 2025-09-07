package programasSemana03.herenciaabstractavehiculo;

public class Bicicleta extends Vehiculo {
    private static final float PORCE_DEP = 0.05f;

    public Bicicleta(float precioInicial) {
        super(precioInicial, PORCE_DEP);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== BICICLETA ===");
        System.out.println("Precio Inicial: " + precioInicial);
        System.out.println("Monto depreciacion: " + montoDepreciacion);
        System.out.println("Precio total: " + precioFinal);
    }
}
