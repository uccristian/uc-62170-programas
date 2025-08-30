package programasSemana02.empresa.industria;

import programasSemana02.alumno.LeerCadena;

public class Menu {
  private final String[] Options;

  public Menu(String[] Options) {
    this.Options = Options;
  }

  public void ShowMenu() {
    System.out.println("\n===== MOSTRAR MENU =====");
    for (int i = 0; i < Options.length; i++) {
      System.out.println((i + 1) + ". " + Options[i]);
    }
  }

  public int SelectMenu() {
    String opString = LeerCadena.Lectura("Ingrese opcion: ");
    int option = Integer.parseInt(opString);
    return option;
  }
}
