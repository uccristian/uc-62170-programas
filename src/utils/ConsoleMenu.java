package utils;

import java.util.Scanner;

public class ConsoleMenu {
    private final String[] options;
    private Scanner scanner;

    public ConsoleMenu(String[] options) {
        this.options = options;
        this.scanner = new Scanner(System.in);
    }

    public void showMenu(String title) {
        System.out.println("\n========= " + title + " ========");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    public int selectOption() {
        int choice;
        while (true) {
            System.out.print("Selecciona una opcion [1-" + options.length + "]");
            choice = InputReader.readInt("");
            if (choice >= 1 && choice <= options.length) {
                return choice;
            } else {
                System.out.println("Opcion no valida. Ingrese un numero entre 1 y " + (options.length));
            }
        }
    }
}
