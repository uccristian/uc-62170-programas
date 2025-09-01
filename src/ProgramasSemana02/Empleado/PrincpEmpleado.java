package ProgramasSemana02.Empleado;

class Empleado1{

        private String Nombres;
        private String Apellidos;
        private int Edad;

        public void Registrar(String Nombre, String Apellido, int Ed){
        
            this.Nombres = Nombre;
            this.Apellidos = Apellido;
            this.Edad = Ed;
        }
        
        public void Mostrar(){
        
            System.out.println("Su nombtre es: " + Nombres);
            System.out.println("Su apellido es: " + Apellidos);
            System.out.println("Su edad es: " + Edad);
         }
}

public class PrincpEmpleado {
    
    public static void main(String[] args) {
        
        Empleado1 Emp = new Empleado1();
        
        Emp.Registrar("Juan", "Perez", 25);
        
        Emp.Mostrar();
        
    }
}

