package programasSemana01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgramaCajero {

    public static void main(String[] args) throws IOException {
        BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));

        int op;
        float mdp, mrt, msd = 0;

        do {
            System.out.println("\n Cajero \n");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Saldo");
            System.out.println("4. Salir");
            System.out.print("Seleccione opcion: ");
            op = Integer.parseInt(dato.readLine());

            if (op != 4) {
                switch (op) {
                    case 1: {
                        do {
                            System.out.print("Ingrese monto a depositar: ");
                            mdp = Float.parseFloat(dato.readLine());

                            if (mdp <= 0) {
                                System.out.println("Error. Vuelva a ingresar");
                            }
                        } while (mdp <= 0);
                        
                        msd = msd + mdp;
                    }
                    break;
                    case 2: {
                        do {
                            System.out.println("Ingrese monto a retirar: ");
                            mrt = Float.parseFloat(dato.readLine());

                            if (mrt <= 0) {
                                System.out.println("Error. Vuelva ingresar");
                            }
                        } while (mrt <= 0);

                        if (mrt <= msd) {
                            msd = msd - mrt;
                        } else {
                            System.out.println("Saldo Insuficiente");
                        }
                    }
                    case 3: {
                        System.out.print("Su saldo es: " + msd);
                    }
                    break;
                    default:
                        throw new AssertionError();
                }
            }
        } while (op != 4);
    }
}
