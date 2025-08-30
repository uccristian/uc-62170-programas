package programasSemana02.boleta;

import utils.InputReader;

public class PrincipalVenta {

    public static void main(String[] args) {
        String nombreCliente = InputReader.readString("Ingrese el nombre del cliente");
        String numBoleta = InputReader.readString("Ingrese el numero del boleta");
        int cantidad = InputReader.readInt("Ingrese la cantidad");
        double precio = InputReader.readDouble("Ingrese el precio");

        BoletaVenta boleta = new BoletaVenta(cantidad, nombreCliente, numBoleta, precio);
        boleta.Mostrar();
    }
    
}
