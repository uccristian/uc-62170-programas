package programasSemana01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Programa0Ejemplo {

    public static void main(String[] args) throws NumberFormatException, IOException {
       BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));

       int num1, num2, num3;

       System.out.println("Ingrese num1: ");
       num1 = Integer.parseInt(dato.readLine());

       System.out.println("Ingrese num2: ");
       num2 = Integer.parseInt(dato.readLine());

       num3 = num1 + num2;

       System.out.println("La suma es: " + num3);
    }
    
}
