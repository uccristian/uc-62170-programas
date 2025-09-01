package ProgramasSemana02.Celular;

public class Celular {
    
    private String Marca;
    private String Modelo;
    private int Numserie;
    
    public void Registrar()
    {
        System.out.println("Ingrese Marca celular: ");
        this.Marca = leerCadena.lectura();
        
        System.out.println("Ingrese Modelo del celular: ");
        this.Modelo = leerCadena.lectura();
        
        do{
            System.out.println("Ingrese numero de serie: ");
            this.Numserie = Integer.parseInt(leerCadena.lectura());
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
