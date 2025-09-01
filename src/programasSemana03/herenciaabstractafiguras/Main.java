package programasSemana03.herenciaabstractafiguras;

import utils.ConsoleMenu;
import utils.InputReader;

public class Main {
    public static void main(String[] args) {
        String[] opciones = {"Cuadrado", "Circulo", "Salir"};
        ConsoleMenu menu = new ConsoleMenu(opciones);
        int opcion;
    
        do{
            menu.showMenu("MENU");
            opcion = menu.selectOption();
            
            switch (opcion) {
                case 1 -> {
                   int lado = InputReader.readInt("INgrese lado de cuadrado", 1);
                   Cuadrado cuadrado = new Cuadrado(lado);
                   double areaCuadrado = cuadrado.area();
                   System.out.println("El area del cuadrado es: " + areaCuadrado);
                }
                case 2 -> {
                    int radio = InputReader.readInt("Ingrese radio del circulo", 1);
                    Circulo circulo = new Circulo(radio);
                    double areaCirculo = circulo.area();
                    System.out.println("El area del circulo es: " + areaCirculo);
                }
                case 3 -> System.out.println("\nGracias...!...Vuelva pronto.");
            }
    
        } while (opcion != opciones.length);
    }
}
