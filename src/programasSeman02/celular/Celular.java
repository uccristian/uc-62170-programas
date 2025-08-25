package programasSeman02.celular;

public class Celular {
    private final String Marca;
    private final String Modelo;
    private final int NumSerie;

    public Celular(String Marca, String Modelo, int NumSerie) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.NumSerie = NumSerie;
    }

    public void Mostrar() {
        System.out.println("La marca es: " + Marca);
        System.out.println("El modelo es: " + Modelo);
        System.out.println("El numero de serie es: " + NumSerie);
    }
}
