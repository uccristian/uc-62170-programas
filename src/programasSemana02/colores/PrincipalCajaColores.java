package programasSemana02.colores;

import programasSemana02.empresa.industria.Industria;
import utils.ConsoleMenu;
import utils.InputReader;

import java.util.ArrayList;
import java.util.List;

public class PrincipalCajaColores {
    public static void main(String[] args) {
        String[] options = {"Registro", "Mostrar colores", "Salir"};
        ConsoleMenu menu = new ConsoleMenu(options);
        List<ColorBox> color = new ArrayList<ColorBox>();

        int option;
        do {
            menu.showMenu("MENU PRINCIPAL");
            option = menu.selectOption();

            switch (option) {
                case 1 -> {
                    color.add(registerColor());
                }
                case 2 -> {
                    for (ColorBox colorBox : color) {
                        colorBox.devolverDatosCajaColor();
                        colorBox.devolverMontoVentaTotal();
                        System.out.println("\n");
                    }
                }
                case 3 -> {
                    System.out.println("Gracias por utilizar colores");
                }
            }

        } while (option != 4);
    }

    public static ColorBox registerColor() {
        String codUtil = InputReader.readString("Ingresa el codigo del color");
        String descripUtil = InputReader.readString("Ingresa el descripcion del color");
        double precioUni = InputReader.readDouble("Ingresa el precio del color");
        String marca = InputReader.readString("Ingresa el marca del color");
        int unidadesCaja = InputReader.readInt("Ingresa el unidades del color");
        int cantidadVendida = InputReader.readInt("Ingresa el cantidad del color");
        int codOferta = InputReader.readInt("Ingresa el codigo del color");
        char descripcionOferta = InputReader.readChar("Ingresa el descripcion del color (A o B o C)");

        ColorBox colorBox = new ColorBox(codUtil, marca, unidadesCaja, codOferta);
        colorBox.descripUtil = descripUtil;
        colorBox.precioUni = precioUni;
        colorBox.cantidadVendida = cantidadVendida;
        colorBox.descripcionOferta = descripcionOferta;
        return colorBox;
    }

}
