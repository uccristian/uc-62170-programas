package programasSemana02.empleado;

public class Empleado {
    private String Nombre;
    private String Apellidos;
    private int Edad;

    public void Registrar(String Apellidos, int Edad, String Nombre) {
        this.Apellidos = Apellidos;
        this.Edad = Edad;
        this.Nombre = Nombre;
    }

    public void Mostrar() {
        System.out.println("Su nombre es: " + Nombre);
        System.out.println("Su apellido es: " + Apellidos);
        System.out.println("Su edad es: " + Edad);
    }
}
