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
                System.out.println("Entrada inválida. Intenta nuevamente.");
            }
        }
    }
    
    public static int readInt(String message, int minValue) {
        while (true) {
            try {
                String input = readString(message + " (mínimo " + minValue + ")");
                int value = Integer.parseInt(input.trim());
                if (value >= minValue) {
                    return value;
                } else {
                    System.out.println("El valor debe ser mayor o igual a " + minValue + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Intenta nuevamente.");
            }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            try {
                String input = readString(message);
                return Float.parseFloat(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Intenta nuevamente.");
            }
        }
    }

    public static float readFloat(String message, float minValue) {
        while (true) {
            try {
                String input = readString(message + " (mínimo "  + minValue + ")");
                float value = Float.parseFloat(input.trim());
                if (value >= minValue) {
                    return value;
                } else {
                    System.out.println("El valor debe ser mayor o igual a " + minValue + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Intenta nuevamente.");
            }
        }
    }


    public static char readChar(String message) {
        while (true) {
            try {
                String input = readString(message);
                return input.charAt(0);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Intenta nuevamente.");
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            try {
                String input = readString(message);
                return Double.parseDouble(input.trim());
            }  catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Intenta nuevamente.");
            }
        }
    }
    
    public static double readDouble(String message, double minValue) {
        while (true) {
            try {
                String input = readString(message + " (mínimo " + minValue + ")");
                double value = Double.parseDouble(input.trim());
                if (value >= minValue) {
                    return value;
                } else {
                    System.out.println("El valor debe ser mayor o igual a " + minValue + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Intenta nuevamente.");
            }
       }
    }
}
