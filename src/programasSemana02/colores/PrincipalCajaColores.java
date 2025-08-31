package programasSemana02.colores;

import utils.ConsoleMenu;
import utils.InputReader;

import java.util.ArrayList;
import java.util.List;

public class PrincipalCajaColores {
    public static void main(String[] args) {
        String[] options = {"Registro", "Mostrar color", "Devolver monto total de ventas", "Salir"};
        ConsoleMenu menu = new ConsoleMenu(options);
        CajaColores cajaColores = new CajaColores();

        int option;
        do {
            menu.showMenu("MENU PRINCIPAL");
            option = menu.selectOption();

            switch (option) {
                case 1 -> {
                    String codUtil = InputReader.readString("Ingresa el codigo del color");
                    String descripUtil = InputReader.readString("Ingresa el descripcion del color");
                    double precioUni = InputReader.readDouble("Ingresa el precio del color");
                    String marca = InputReader.readString("Ingresa el marca del color");
                    int unidadesCaja = InputReader.readInt("Ingresa el unidades del color");
                    int cantidadVendida = InputReader.readInt("Ingresa el cantidad del color");
                    int codOferta = InputReader.readInt("Ingresa el codigo del color");
                    char descripcionOferta = InputReader.readChar("Ingresa el descripcion del color (A o B o C)");

                    cajaColores.registrar(codUtil, descripUtil, precioUni, marca, unidadesCaja, cantidadVendida, codOferta, descripcionOferta);
                }
                case 2 -> {
                    cajaColores.devolverDatosCajaColor();
                }
                case 3 -> {
                    cajaColores.devolverMontoVentaTotal();
                }
                case 4 -> {
                    System.out.println("");
                }
            }

        } while (option != 4);
    }

}
