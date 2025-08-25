package programasSemana02.empresa.industria;

public class Industria {
    private final String NombIndustria;
    private Empresa Empresa;

    public Industria(Empresa Empresa, String NombIndustria) {
        this.Empresa = Empresa;
        this.NombIndustria = NombIndustria;
    }
    
    public String ConsultarEmpresa() {
        return Empresa.Consultar();
    }
    
    public String TotalProd() {
        return "El total de produccion es: " + Empresa.DevolverProd();
    }
}
