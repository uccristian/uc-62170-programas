package programasSemana02.celular;

public class Celular {
    private String Marca;
    private String Modelo;
    private int NumSerie;

    public Celular() {
    }

    public void registrar(String Marca, String Modelo, int NumSerie) {
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
