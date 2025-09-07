package programasSemana03.herenciaabstractavehiculo;

import utils.ConsoleMenu;
import utils.InputReader;

public class Main {
    public static void main(String[] args) {
        final String[] opciones = {"Automovil", "Bicicleta", "Tren", "Salir"};
        ConsoleMenu menu = new ConsoleMenu(opciones);
        int opcion;

        do {
            menu.showMenu("MENU PRINCIPAL");
            opcion = menu.selectOption();

            switch (opcion) {
                case 1 -> {
                    final String[] subOpciones = {"Auto particular", "Auto publico", "Volver"};
                    ConsoleMenu subMenu = new ConsoleMenu(subOpciones);
                    int subOpcion;

                    do {
                        subMenu.showMenu("SUBMENU AUTOMOVIL");
                        subOpcion = menu.selectOption();

                        switch (subOpcion) {
                            case 1 -> {
                                float price = InputReader.readFloat("Ingresar precio del automovil particular", 1);
                                AutoParticular autoParticular = new AutoParticular(price);
                                autoParticular.mostrarInfo();
                            }
                            case 2 -> {
                                float price = InputReader.readFloat("Ingresar precio del automovil publico", 1);
                                AutoPublico autoPublico = new AutoPublico(price);
                                autoPublico.mostrarInfo();
                            }
                        }

                    } while (subOpcion != subOpciones.length);
                }
                case 2 -> {
                    float price = InputReader.readFloat("Ingresar precio de la bicibleta", 1);
                    Bicicleta bicicleta = new Bicicleta(price);
                    bicicleta.mostrarInfo();
                }
                case 3 -> {
                    float price = InputReader.readFloat("Ingresar precio del tren", 1);
                    Tren tren = new Tren(price);
                    tren.mostrarInfo();
                }
                case 4 -> {
                    System.out.println("Saliendo...");
                }
            }
        } while (opcion != opciones.length);
    }
}
