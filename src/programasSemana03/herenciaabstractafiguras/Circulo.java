package programasSemana03.herenciaabstractafiguras;

public class Circulo extends Figura {
    private final int radio;
    
    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return (Math.PI * Math.pow(radio, 2));
    }
}
