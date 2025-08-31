package utils;

import java.util.Scanner;

public class InputReader {
    private static Scanner scanner = new Scanner(System.in);

    public static String readString(String message) {
        System.out.print(message + ": ");
        return scanner.nextLine();
    }

    public static int readInt(String message) {
        while (true) {
            try {
                String input = readString(message);
                return Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. " + message);
            }
        }
    }

    public static char readChar(String message) {
        while (true) {
            try {
                String input = readString(message);
                return input.charAt(0);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. " + message);
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            try {
                String input = readString(message);
                return Double.parseDouble(input.trim());
            }  catch (NumberFormatException e) {
                System.out.println("Invalid input. " + message);
            }
        }
    }
}
