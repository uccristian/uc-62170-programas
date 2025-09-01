package ProgramasSemana02.Boleta;

public class PrincipBoleta {
    
    public static void main(String[] args) 
    {
        Boleta Bole= new Boleta();  
        
        int op;
        
        do{ 
            System.out.println("\n");
            System.out.println("==== BOLETA ===");
            System.out.println("1. Ingresar");
            System.out.println("2. Mostrar");
            System.out.println("3. Salir");
            
            do{
                System.out.print("Ingrese opcion:\t");
                op=Integer.parseInt(leerCadena.lectura());
                if(op!=1 && op!=2 && op!=3)
                    System.out.println("ERROR. Vuelva a Ingresar");
            }while(op!=1 && op!=2 && op!=3);
            
            switch(op)
                {   case 1 -> {  System.out.println("========Registrar========");
                                 Bole.Registrar();
                              }
                
                    case 2 -> {  System.out.println("========Reporte========");
                                 Bole.Mostrar();        
                              }
                    
                    case 3 -> System.out.print("Gracias..! Vuelva pronto\n"); 
                }
        }while(op !=3);    
    }
} 
