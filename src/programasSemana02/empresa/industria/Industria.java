package programasSemana02.empresa.industria;

public class Industria {
    private final String NombIndustria;
    private final Empresa Empresa;

    public Industria(Empresa Empresa, String NombIndustria) {
        this.Empresa = Empresa;
        this.NombIndustria = NombIndustria;
    }

    public void ConsultarEmpresa() {
        Empresa.Consultar();
    }

    public String TotalProd() {
        return "El total de produccion es: " + Empresa.DevolverProd();
    }

    public String GetInfo(String[] args) {
        return "El nombre de la industria es: " + NombIndustria;
    }

    public String GetCompanyName() {
        return Empresa.GetCompanyName();
    }
}
