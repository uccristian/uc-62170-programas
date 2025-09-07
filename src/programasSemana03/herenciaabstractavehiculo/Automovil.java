package programasSemana03.herenciaabstractavehiculo;

public class Automovil extends Vehiculo {
    private final float PORCE_DEP = 0.25f;

    public Automovil(float precio) {
        precioInicial = precio;
        montoDepre = precioInicial * PORCE_DEP;
    }

    public void Mostrar() {
        System.out.println("=== AUTOMOVIL ===");
        System.out.println("Precio Inicial: " + precioInicial);
        System.out.println("Monto depreciacion: " + montoDepre);
        System.out.println("Precio total: " + calcularPrecioFinal());
    }

    @Override
    public float calcularPrecioFinal() {
        total = precioInicial  - montoDepre;
        return total;
    }
}
