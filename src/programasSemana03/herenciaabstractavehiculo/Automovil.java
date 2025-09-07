package programasSemana03.herenciaabstractavehiculo;

public class Automovil extends Vehiculo {
    private static final float PORCE_DEP = 0.25f;

    public Automovil(float precioInicial) {
        super(precioInicial, PORCE_DEP);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== AUTOMOVIL ===");
        System.out.println("Precio Inicial: " + precioInicial);
        System.out.println("Monto depreciacion: " + montoDepreciacion);
        System.out.println("Precio total: " + precioFinal);
    }
}
