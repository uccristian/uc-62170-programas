package ProgramasSemana02.EmpresaIndustria;

public class PrincpIndustria {

    public static void main(String[] args) {        
        int op;
        Industria ind = new Industria();
        
        do{ System.out.println("\n====== MENU Industria ======");
            System.out.println("1. Registrar.");
            System.out.println("2. Mostrar.");
            System.out.println("3. Salir.");
            
            System.out.println("Ingrese Opcion: ");
            op = Integer.parseInt(leerCadena.lectura());
        
            switch(op){
            
                case 1 -> ind.Registrar();
                        
                case 2 -> System.out.println("Reporte datos de empresa: "
                          +ind.consultarEmp()+ind.TotalProd());
                        
                case 3 -> System.out.println("GRACIAS..!!");
            }            
         }while(op!=3);
    }
}


