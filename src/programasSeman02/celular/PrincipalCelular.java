package programasSeman02.celular;

import programasSemana02.alumno.LeerCadena;

public class PrincipalCelular {

    public static void main(String[] args) {
        String marca, modelo, numSerieStr;
        int numSerie;

        marca = LeerCadena.Lectura("Ingrese maca:");
        modelo = LeerCadena.Lectura("Ingrese modelo:");
        numSerieStr = LeerCadena.Lectura("Ingrese numero de serie:");
        numSerie = Integer.parseInt(numSerieStr);

        Celular celular = new Celular(marca, modelo, numSerie);

        celular.Mostrar();
    }
    
}
