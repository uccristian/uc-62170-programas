package programasSemana02.alumno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerCadena {

    public static String Lectura(String descripcion) {
        String cadena = null;

        try {
            System.out.println(descripcion);
            BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
            cadena = dato.readLine();
        } catch (IOException e) {
        }

        return cadena;
    }
}
