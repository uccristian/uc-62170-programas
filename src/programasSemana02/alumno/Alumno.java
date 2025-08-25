package programasSemana02.alumno;

public class Alumno {
    private final String Nombres;
    private final int Codigo;    

    public Alumno(int Codigo, String Nombres) {
        this.Codigo = Codigo;
        this.Nombres = Nombres;
    }

    public void Mostrar() {
        System.out.println("El codigo es: " + Codigo);
        System.out.println("El nombre es: " + Nombres);
    }

}
