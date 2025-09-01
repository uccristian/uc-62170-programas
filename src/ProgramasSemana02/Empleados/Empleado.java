package ProgramasSemana02.Empleados;

public class Empleado {
    
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

