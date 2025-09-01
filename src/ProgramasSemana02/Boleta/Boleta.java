package ProgramasSemana02.Boleta;

public class Boleta {
    
    private String Nombrecliente;
    private int Numboleta;
    private int Cantidad;
    private double Precio;
    private double Montototal;
    
    public void Registrar()
    {
        System.out.println("Ingrese Nombre del cliente: ");
        this.Nombrecliente = leerCadena.lectura();
        
        do{
            System.out.println("Ingrese número de boleta: ");
            this.Numboleta = Integer.parseInt(leerCadena.lectura());
            if(Numboleta<=0)
               System.out.println("ERROR. Vuelva a Ingresar");
        }while(Numboleta<=0);            
        
        do{
            System.out.println("Ingrese cantidad: ");
            this.Cantidad = Integer.parseInt(leerCadena.lectura());
            if(Cantidad<=0)
               System.out.println("ERROR. Vuelva a Ingresar");
        }while(Cantidad<=0);  
         
         
         do{
            System.out.println("Ingrese precio: ");
        this.Precio = Double.parseDouble(leerCadena.lectura());
            if(Precio<=0)
               System.out.println("ERROR. Vuelva a Ingresar");
        }while(Precio<=0);            
                
        Montototal = Cantidad*Precio;
    }

    public void Mostrar()
    {
        System.out.println("El es: "+Nombrecliente);
        System.out.println("Numero de boleta: "+Numboleta);
        System.out.println("Ingresado precio: "+Cantidad);
        System.out.println("Monto toal: "+Montototal);
    }
}
