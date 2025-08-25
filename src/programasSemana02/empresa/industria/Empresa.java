package programasSemana02.empresa.industria;

public class Empresa {
    private final String Nombre;
    private final String Ruc;
    private final float ProdTotal;

    public Empresa(String Nombre, float ProdTotal, String Ruc) {
        this.Nombre = Nombre;
        this.ProdTotal = ProdTotal;
        this.Ruc = Ruc;
    }
    
    public float DevolverProd() {
        return ProdTotal;
    }
    
    public String Consultar() {
        return "Ruc: " + Ruc + "\tNombre" + Nombre + "\tProduccion Total: " + ProdTotal + "\n";
    }
}
