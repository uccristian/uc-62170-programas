package ProgramasSemana02.EmpresaIndustria;

public class Industria {
    
    private String NombInd;
    private Empresa emp;
    
    public void Registrar(){    
        int NRUC;
        String NmEmp;
        float PrdT;
        
        System.out.println("Ingrese nombre industria: ");
        NombInd = leerCadena.lectura();
        
        System.out.println("Ingrese nombre empresa: ");
        NmEmp =  leerCadena.lectura();
        
        System.out.println("Ingrese RUC empresa: ");
        NRUC =  Integer.parseInt(leerCadena.lectura());
        
        System.out.println("Ingrese produccion empresa: ");
        PrdT =  Integer.parseInt(leerCadena.lectura());
        
        emp = new Empresa(NmEmp,NRUC, PrdT ); //invocando al costructor de empresa
    }
    
    public String consultarEmp(){    
        String Datos;
        
        Datos = emp.Consultar();        
        return "Los datos empresa son: " + Datos;    
    }
    
    public String TotalProd(){    
      float total;
      
      total = emp.DevolverProd();      
      return "El total produccion :"+total;
    }
}

