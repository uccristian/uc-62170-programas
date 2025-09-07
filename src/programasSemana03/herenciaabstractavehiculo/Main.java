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
                    float price = InputReader.readFloat("Ingresar precio del automovil", 1);
                    Automovil automovil = new Automovil(price);
                    automovil.calcularPrecioFinal();
                    automovil.Mostrar();
                }
                case 2 -> {
                    float price = InputReader.readFloat("Ingresar precio de la bicibleta", 1);
                    Bicicleta bicicleta = new Bicicleta(price);
                    bicicleta.calcularPrecioFinal();
                    bicicleta.Mostrar();
                }
                case 3 -> {
                    float price = InputReader.readFloat("Ingresar precio del tren", 1);
                    Tren tren = new Tren(price);
                    tren.calcularPrecioFinal();
                    tren.Mostrar();
                }
            }

        } while (opcion != opciones.length);
    }
}
