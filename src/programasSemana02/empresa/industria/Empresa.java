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

    public void Consultar() {
        System.out.println("Ruc: " + Ruc);
        System.out.println("Nombre: " + Nombre);
        System.out.println("Produccion Total: " + ProdTotal);
        System.out.println("");
    }

    public String GetCompanyName() {
        return Nombre;
    }
}
