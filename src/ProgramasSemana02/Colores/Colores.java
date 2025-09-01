package ProgramasSemana02.Colores;

public class Colores {
    private int codUtil;
    private String DescripUtil;
    private float PrecioUni;
    private String Marca;
    private int UnidadesCaja;
    private int CantidadVendida;
    private int CodOferta;
    private String DescripcionOferta;
    private float MontoBruto;
    private float MontoDcto;
    private float MontoVentaTotal;
    private float dcto;
     
    public void Registar(){
    
        do{
            System.out.print("Ingrese código de caja de colores:");
            this.codUtil=Integer.parseInt(leerCadena.lectura());
            
            if(codUtil<=0)
                System.out.println("ERROR. Los datos deben ser >0. Vuelva a ingresar.");
        }while(codUtil<=0);
    
        System.out.print("Ingrese descripción de caja de colores:");
        this.DescripUtil=(leerCadena.lectura());
    
        do{
            System.out.print("Ingrese precio de unidad por caja:");
            this.PrecioUni=Float.parseFloat(leerCadena.lectura());
            
            if(PrecioUni<=0)
                System.out.println("ERROR. Los datos deben ser >0. Vuelva a ingresar.");
        }while(PrecioUni<=0);
    
        System.out.print("Ingrese marca de la caja de colores:");
        this.Marca=(leerCadena.lectura());
        
        do{
            System.out.print("Ingrese unidades de colores de la caja:");
            this.UnidadesCaja=Integer.parseInt(leerCadena.lectura());
            
            if(UnidadesCaja<=0)
                System.out.println("ERROR. Los datos deben ser >0. Vuelva a ingresar.");
        }while(UnidadesCaja<=0);
    
        do{
            System.out.print("Ingrese cantidad de cajas de colores vendidas:");
            this.CantidadVendida=Integer.parseInt(leerCadena.lectura());
            
            if(CantidadVendida<=0)
                System.out.println("ERROR. Los datos deben ser >0. Vuelva a ingresar.");
        }while(CantidadVendida<=0);
    
        do{
            System.out.print("Ingrese descripción de oferta (A/B/C):"); //!=
            this.DescripcionOferta=(leerCadena.lectura());
                
            if(!"A".equals(DescripcionOferta) &&!"a".equals(DescripcionOferta)&&!"B".equals(DescripcionOferta)&&!"b".equals(DescripcionOferta)&&!"C".equals(DescripcionOferta) &&!"c".equals(DescripcionOferta))
                System.out.println("ERROR. Los datos deben ser A a  B b C c. Vuelva a ingresar.");
        }while(!"A".equals(DescripcionOferta) &&!"a".equals(DescripcionOferta)&&!"B".equals(DescripcionOferta)&&!"b".equals(DescripcionOferta)&&!"C".equals(DescripcionOferta) &&!"c".equals(DescripcionOferta) );
    
        do{
            System.out.print("Ingrese código de oferta:");
            this.CodOferta=Integer.parseInt(leerCadena.lectura());
            
            if(CodOferta<=0)
                System.out.println("ERROR. Los datos deben ser >0. Vuelva a ingresar.");
        }while(CodOferta<=0);
    
    
        if("A".equals(DescripcionOferta)||"a".equals(DescripcionOferta))
            dcto=(float) 0.05;
        else
            if("B".equals(DescripcionOferta)||"b".equals(DescripcionOferta))
                dcto=(float) 0.1;
            else
                if("C".equals(DescripcionOferta)||"c".equals(DescripcionOferta))
                    dcto=(float) 0.15;
        
        MontoBruto=CantidadVendida*PrecioUni;
        MontoDcto=MontoBruto*dcto;
        MontoVentaTotal=MontoBruto-MontoDcto;
    }
    
    public void DevolverDatosCajaColor( ){
        
        System.out.println("El código de la caja de colores es:"+codUtil);
        System.out.println("La descripción de caja de colores es:"+DescripUtil);
        System.out.println("El precio de unidad por caja es:"+PrecioUni);
        System.out.println("La marca de la caja de colores es:"+Marca);
        System.out.println("Cantidad de unidades de colores de la caja:"+UnidadesCaja);
        System.out.println("Cantidad de cajas de colores vendidas:"+CantidadVendida);
        System.out.println("El código de oferta es:"+CodOferta);
        System.out.println("La descripción de oferta es:"+DescripcionOferta);
    }
    
    public void MontoVentaTotal(){

        System.out.println("El monto bruto es:"+MontoBruto);
        System.out.println("El monto de descuento es:"+MontoDcto);
        System.out.println("El monto total de venta es:"+MontoVentaTotal+"\n");
   }
}
