package ProgramasSemana02.Celular;

import utils.InputReader;

public class Celular {
    
    private String Marca;
    private String Modelo;
    private int Numserie;
    
    public void Registrar()
    {
        this.Marca = InputReader.readString("Ingrese la marca del celular");
        
        this.Modelo = InputReader.readString("Ingrese Modelo del celular");
        
        do{
            this.Numserie = InputReader.readInt("Ingrese numero de serie");
            if(Numserie<=0)
               System.out.println("ERROR. Vuelva a Ingresar");
        }while(Numserie<=0);
    }
    public void Mostrar()
    {
        System.out.println("La marca es: "+Marca);
        System.out.println("El Modelo es: "+Modelo);
        System.out.println("El num de serie es: "+Numserie);
    }
}
