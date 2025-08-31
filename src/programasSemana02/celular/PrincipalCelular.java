package programasSemana02.celular;

import utils.InputReader;

public class PrincipalCelular {

    public static void main(String[] args) {
        String marca, modelo, numSerieStr;
        int numSerie;

        marca = InputReader.readString("Ingrese la marca: ");
        modelo = InputReader.readString("Ingrese la modelo: ");
        numSerie = InputReader.readInt("Ingrese la numero de serie: ");

        Celular celular = new Celular();

        celular.registrar(marca, modelo, numSerie);
        celular.Mostrar();
    }
    
}
