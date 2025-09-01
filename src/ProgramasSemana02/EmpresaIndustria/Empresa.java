package ProgramasSemana02.EmpresaIndustria;

public class Empresa {
    
    private String Nombre;
    private int RUC;
    private float ProdTotal;
    
    public Empresa(String Nomb, int NRUC, float PrdT){  // constructor
        this.Nombre = Nomb;
        this.RUC = NRUC;
        this.ProdTotal = PrdT;        
    }
    
    public float DevolverProd(){
        return ProdTotal;
    }
    
    public String Consultar(){
        return "RUC: "+RUC+"\tNombre :"+Nombre+"\tProduccion Total : "+ProdTotal+"\n";
    }
}

