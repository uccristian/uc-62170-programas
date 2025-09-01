package ProgramasSemana02.Almacen;

public class Producto {  // ESTA CLASE SE CREA PRIMERO
    
    private int codProd;
    private String nombProd;
    private float CostoProd;
    
    public Producto(int CodigoProducto,String NombreProd,float costoProduc){
    
        this.codProd =CodigoProducto ;
        this.nombProd = NombreProd;
        this.CostoProd = costoProduc;
        
    }
    
    public String DevolverDatosProd( ){
        
        return "\nCodigo del producto:"+codProd+"\nNombre del producto:"+nombProd;
    }
    
    public float DevolverCostoProd( ){
    
        return CostoProd;
    }    
}
