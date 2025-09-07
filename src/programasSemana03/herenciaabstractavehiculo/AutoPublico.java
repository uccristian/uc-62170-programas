package programasSemana03.herenciaabstractavehiculo;

public class AutoPublico extends Automovil {
    private static final float PORCE_DEP = 0.60f;

    public AutoPublico(float precioInicial) {
        super(precioInicial);
        this.montoDepreciacion = precioInicial * PORCE_DEP;
        this.precioFinal = precioInicial - montoDepreciacion;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== AUTOMÓVIL PARTICULAR ===");
        System.out.println("Precio inicial: " + precioInicial);
        System.out.println("Depreciación: " + montoDepreciacion);
        System.out.println("Precio final: " + precioFinal);
    }
}
