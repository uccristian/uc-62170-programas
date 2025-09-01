package ProgramasSemana02.Almacen;

public class ReproductorDVD {
    
    private String Marca;
    private String Modelo;
    private float PorcentajeDscto;
    private float MontoDscto;
    private String datos1;
    
    private Producto prod;   // AQUI se invoca a PRODUCTO
    
    
    public void Registro(){
    
        int CodigoProducto;
        String NombreProd;
        
        float costoProduc ;
        
        do{
            System.out.print("Ingrese Codigo del reproductor DVD: ");
            CodigoProducto= Integer.parseInt(leerCadena.lectura());
            if(CodigoProducto<=0)
               System.out.println("ERROR. Vuelva a Ingresar");
        }while(CodigoProducto<=0);
        
        System.out.print("Ingrese nombre del articulo: ");
        NombreProd =  leerCadena.lectura();
        
        do{
            System.out.print("Ingrese costo del reproductor DVD: ");
            costoProduc = Float.parseFloat(leerCadena.lectura());
            if(costoProduc<=0)
               System.out.println("ERROR. Vuelva a Ingresar");
        }while(costoProduc<=0);
        
        System.out.print("Ingrese marca del reproductor DVD: ");
        Marca =  leerCadena.lectura();
        
        System.out.print("Ingrese modelo del reproductor DVD: ");
        Modelo =  leerCadena.lectura();
        
        do{
            System.out.print("Ingrese descuento(decimal): ");
            PorcentajeDscto = Float.parseFloat(leerCadena.lectura());
            if(PorcentajeDscto<=0)
               System.out.println("ERROR. Vuelva a Ingresar");
        }while(PorcentajeDscto<=0);
        
        datos1="\nCosto del producto:"+costoProduc+"\nMarca:"+Marca+"\nModelo:"+Modelo;
        MontoDscto=costoProduc*PorcentajeDscto;
       
        prod = new Producto(CodigoProducto, NombreProd,costoProduc );   
    }
    
    
    public String DevolverDatosReprod( ){
    
      String datos;
      
      datos = prod.DevolverDatosProd()+datos1;
      
      return "DATOS DEL REPRODUCTOR DVD"+datos;
    }
    
    public String DevolverPrecioVentaReprod( ){
    
        float PrecioVenta;
        
        PrecioVenta = prod.DevolverCostoProd()-MontoDscto;
        
        return "\nPRECIO DE VENTA DEL REPRODUCTOR DVD: " + PrecioVenta;
    
    }
}
