package programasSemana03.herenciaabstractavehiculo;

public abstract class Vehiculo {
    protected float precioInicial;
    protected float montoDepreciacion;
    protected float precioFinal;

    public Vehiculo(float precioInicial, float porcentajeDep) {
        this.precioInicial = precioInicial;
        this.montoDepreciacion = precioInicial * porcentajeDep;
        this.precioFinal = precioInicial - montoDepreciacion;
    }

    public abstract void mostrarInfo();

    public void encender(){
        System.out.println("El vehiculo esta encendido");
    }
}
