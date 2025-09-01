package ProgramasSemana02.Alumnos;

public class PrincipAlunmo {
    
    public static void main(String[] args) {
       
        Alumno alum = new Alumno();
            
        System.out.println("INGRESO DE DATOS DE ALUMNO");
        alum.Registrar();
            
        System.out.println("REPORTE DE DATOS DE ALUMNO");
        alum.Mostrar();        
    }    
}


