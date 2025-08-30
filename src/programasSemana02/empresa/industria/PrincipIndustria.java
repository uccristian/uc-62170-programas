package programasSemana02.empresa.industria;

import java.util.ArrayList;
import java.util.List;
import programasSemana02.alumno.LeerCadena;
import utils.InputReader;

public class PrincipIndustria {

  public static void main(String[] args) {
    int option = 0;
    List<Industria> industrias = new ArrayList<Industria>();

    String[] options = { "Registrar Empresa", "Mostrar Empresas", "Mostrar Empresa por Nombre", "Salir" };

    Menu menu = new Menu(options);

    do {
      menu.ShowMenu();
      option = menu.SelectMenu();

      switch (option) {
        case 1 -> {
          String CompanyName = LeerCadena.Lectura("Ingrese el nombre de la empresa: ");
          String IndustryName = LeerCadena.Lectura("Ingrese el nombre de la industria: ");
          String RUC = LeerCadena.Lectura("Ingrese RUC de la empresa: ");
          float produccionTotal = Float.parseFloat(LeerCadena.Lectura("Ingrese produccion empresa"));

          Empresa empresa = new Empresa(CompanyName, produccionTotal, RUC);
          Industria industria = new Industria(empresa, IndustryName);
          industrias.add(industria);
        }
        case 2 -> {
          for (Industria industria : industrias) {
            industria.ConsultarEmpresa();
          }
        }
        case 3 -> {
            String search = InputReader.readString("Ingrese el nombre de la empresa: ");
            Industria industria = industrias.stream()
                    .filter(i -> i.GetCompanyName().equalsIgnoreCase(search))
                    .findFirst().orElse(null);
            if (industria != null) {
                industria.ConsultarEmpresa();
            }
        }
        case 4 -> {
          System.out.println("Gracias por usar el sistema");
        }
      }

    } while (option != options.length);
  }

}
