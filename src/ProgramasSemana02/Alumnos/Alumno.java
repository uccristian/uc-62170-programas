package ProgramasSemana02.Alumnos;

public class Alumno {
    
    private String Nombres;
    private int Codigo;
    
    public void Registrar()
    {
        System.out.print("Ingrese Codigo: ");
        this.Codigo = Integer.parseInt(leerCadena.lectura());
        System.out.print("Ingrese Nombre: ");
        this.Nombres = leerCadena.lectura();
     }
    
    public void Mostrar()
    {
        System.out.println("El codigo es: "+Codigo);
        System.out.println("El nombre es: "+Nombres);
    }    
}

