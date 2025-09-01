package ProgramasSemana02.Empleados;

public class PrincEmpleado {
   
    public static void main(String[] args) {
                   
        Empleado Emp = new Empleado();
        
        String nomb, ape;
        int ed;
        
        nomb = "Juan";        
        ape = "Lopez";        
        ed = 20;
        
        Emp.Registrar(nomb, ape, ed);
        
        Emp.Mostrar();        
    }    
}

