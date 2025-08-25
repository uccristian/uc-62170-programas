package programasSemana02.alumno;

public class PrincipAlumno {
    public static void main(String[] args) {
        String nombres, codigoStr;
        int codigo;
        
        nombres = LeerCadena.Lectura("Ingrese nombres: ");
        codigoStr = LeerCadena.Lectura("Ingrese codigo: ");
        codigo = Integer.parseInt(codigoStr);        
        
        Alumno alumn = new Alumno(codigo, nombres);

        alumn.Mostrar();
    }
    
}
