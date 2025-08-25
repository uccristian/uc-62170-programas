package programasSemana02.empleado;

public class PrincEmpleado {

    public static void main(String[] args) {
        Empleado Emp = new Empleado();

        String nomb, ape;
        int ed;
        
        nomb = "Juan";
        ape = "Lopez";
        ed = 20;
        
        Emp.Registrar(ape, ed, nomb);
        Emp.Mostrar();
    }
    
}
