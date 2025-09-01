package ProgramasSemana02.Colores;

public class PrincColores {

    public static void main(String[] args) {
        
       Colores color=new Colores();  // Colores es la clase, y color es el objeto
       
       int op;
       
       do{
            System.out.println("***MENU DE OPCIONES***");
            System.out.println("1.Registrar caja de colores");
            System.out.println("2.Mostrar");
            System.out.println("3.Salir");
            
            do{
                System.out.print("Ingrese opcion:");
                op=Integer.parseInt(leerCadena.lectura());
                if(op!=1 && op!=2 && op!=3)
                    System.out.println("ERROR. Vuelva a Ingresar");
            }while(op!=1 && op!=2 && op!=3);
       
            switch(op)
            {
                case 1:{
                        System.out.println("DATOS DE LA CAJA DE COLORES");
                        color.Registar();

                       }break;
                case 2:{
                        System.out.println("\n");
                        System.out.println("REPORTE DE DATOS");
                        color.DevolverDatosCajaColor();
                        color.MontoVentaTotal();
                        
                       }break;  
                case 3:{
                        System.out.println("¡Gracias!...Vuelva pronto\n");
                       }break;       
            }
       }while(op!=3);
   }
}