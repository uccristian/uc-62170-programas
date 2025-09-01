package ProgramasSemana02.Almacen;

public class Camisa {
    
    private String Talla;
    private String Color;
    private String datos1;
    private float PrecioVenta;
    
    private Producto prod;  // AQUI se invoca a PRODUCTO
    
    
    public void Registrar(){
    
        int CodigoProducto;
        String NombreProd;
        float costoProduc ;
        
        do{
            System.out.print("Ingrese Codigo de la camisa: ");
            CodigoProducto= Integer.parseInt(leerCadena.lectura());
            if(CodigoProducto<=0)
                   System.out.println("ERROR. Vuelva a Ingresar");
        }while(CodigoProducto<=0);
        
        System.out.print("Ingrese nombre del producto (camisa): ");
        NombreProd =  leerCadena.lectura();
        
        do{
            System.out.print("Ingrese costo de la camisa: ");
            costoProduc = Float.parseFloat(leerCadena.lectura());
            if(costoProduc<=0)
                   System.out.println("ERROR. Vuelva a Ingresar");
        }while(costoProduc<=0);
        
        System.out.print("Ingrese talla de la camisa(S/M/L/X...: ");
        Talla =  leerCadena.lectura();
        
        System.out.print("Ingrese color de la comisa: ");
        Color =  leerCadena.lectura();
        
        do{
            System.out.print("Ingrese precio de venta de la camisa: ");
            PrecioVenta = Float.parseFloat(leerCadena.lectura());
             if(PrecioVenta<=0)
                   System.out.println("ERROR. Vuelva a Ingresar");
        }while(PrecioVenta<=0);
        
        datos1="\nCosto del producto:"+costoProduc+"\nTalla:"+Talla+"\nColor:"+Color;
        
        prod = new Producto(CodigoProducto, NombreProd,costoProduc );   
    }
      
    public String DevolverDatosCamisa( ){
    
      String datos;
      
      datos = prod.DevolverDatosProd()+datos1;
      
      return "DATOS DE LA CAMISA"+datos;
    }
    public String DevolverPrecioVentaCamisa( ){
    
        PrecioVenta = prod.DevolverCostoProd();
        
        return "\nPRECIO DE VENTA DE LA CAMISA: " + PrecioVenta;
    
    }
}
