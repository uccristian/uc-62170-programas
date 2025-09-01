package ProgramasSemana02.Almacen;

public class PrincProducto {
   
    public static void main(String[] args) {
        int op, opc;
        
        ReproductorDVD rep = new ReproductorDVD(); // Invoca a la clase y con el constructor crea el espacio de memoriaa usar 
        Camisa cami = new Camisa();  // Invoca a la clase y con el constructor crea el espacio de memoriaa usar
        
        do{
            System.out.println("\n");
            System.out.println("===== MENU DE COMPRA =====");
            System.out.println("1. Reproductor DVD");
            System.out.println("2. Camisa");
            System.out.println("3. Salir");
            
            do{
                System.out.print("Ingrese opcion:\t");
                op=Integer.parseInt(leerCadena.lectura());
                if(op!=1 && op!=2 && op!=3)
                    System.out.println("ERROR. Vuelva a Ingresar");
            }while(op!=1 && op!=2 && op!=3);
            
            switch(op)
            {            
                case 1:{
                            do{       
                                System.out.println("\n");
                                System.out.println("====REPRODUCTOR DVD =====");
                                System.out.println("1. Registrar");
                                System.out.println("2. Mostrar");
                                System.out.println("3. Volver");

                                do{
                                    System.out.print("Ingrese opcion:\t");
                                    opc=Integer.parseInt(leerCadena.lectura());
                                    if(opc!=1 && opc!=2 && opc!=3)
                                        System.out.println("ERROR. Vuelva a Ingresar");
                                }while(opc!=1 && opc!=2 && opc!=3);

                                switch(opc)
                                {
                                    case 1:{
                                                System.out.println("\nREGISTRO DE DATOS");
                                                rep.Registro();
                                            }break;
                                            
                                    case 2:{    System.out.println("\n");
                                                System.out.println("***REPORTE DE DATOS***\n"+rep.DevolverDatosReprod()+rep.DevolverPrecioVentaReprod());
                                            }break;
                                }
                            }while(opc!=3);
                        }break;
                        
                case 2:{
                            do{
                                System.out.println("\n");
                                System.out.println("====CAMISA =====");
                                System.out.println("1. Registrar");
                                System.out.println("2. Mostrar");
                                System.out.println("3. Volver");

                                 do{
                                    System.out.print("Ingrese opcion:\t");
                                    opc=Integer.parseInt(leerCadena.lectura());
                                    if(opc!=1 && opc!=2 && opc!=3)
                                        System.out.println("ERROR. Vuelva a Ingresar");
                                }while(opc!=1 && opc!=2 && opc!=3);

                                switch(opc)
                                {
                                    case 1:{
                                                System.out.println("\nREGISTRO DE DATOS");
                                                cami.Registrar();
                                            }break;
                                            
                                    case 2:{
                                                System.out.println("\n");
                                                System.out.println("***REPORTE DE DATOS***\n"+cami.DevolverDatosCamisa()+cami.DevolverPrecioVentaCamisa());
                                            }break;
                                }  
                            }while(opc!=3);
                        }break;
                        
                case 3:{  System.out.println("GRACIAS...VUELVA PRONTO");
                       }break;
            }            
        }while(op!=3);
    }  
}
