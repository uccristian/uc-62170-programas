package programasSemana02.colores;

public class CajaColores {
    private  String codUtil;
    private String descripUtil;
    private double precioUni;
    private String marca;
    private  int unidadesCaja;
    private int cantidadVendida;
    private  int codOferta;
    private char descripcionOferta;
    private double porcDescto;

    public CajaColores() {
    }

    public void registrar(String codUtil, String descripUtil, double precioUni, String marca, int unidadesCaja, int cantidadVendida, int codOferta, char descripcionOferta) {
        this.codUtil = codUtil;
        this.descripUtil = descripUtil;
        this.precioUni = precioUni;
        this.marca = marca;
        this.unidadesCaja = unidadesCaja;
        this.cantidadVendida = cantidadVendida;
        this.codOferta = codOferta;
        this.descripcionOferta = Character.toUpperCase(descripcionOferta);
    }

    public void devolverDatosCajaColor() {
        System.out.println("Codigo: " + codUtil);
        System.out.println("Marca: " + marca);
        System.out.println("Unidades caja: " + unidadesCaja);
        System.out.println("CodOferta: " + codOferta);
        System.out.println("Descripcion oferta: " + descripcionOferta);
        System.out.println("PorcDescto: " + porcDescto);
        System.out.println("Cantidad de vendidas: " + cantidadVendida);
        System.out.println("Descripcion: " + descripUtil);
    }

    public void devolverMontoVentaTotal() {
        double monto = precioUni * cantidadVendida;

        System.out.println("descripcionOferta: " + descripcionOferta);

        switch(descripcionOferta) {
            case 'A' -> {
                this.porcDescto = 0.05;
            }
            case 'B' -> {
                this.porcDescto = 0.1;
            }
            case 'C' -> {
                this.porcDescto = 0.15;
            }
            default -> {
                this.porcDescto = 0;
            }
        }

        double montoDescuento = monto - (monto * porcDescto);
        double montoVentaTotal = monto - montoDescuento;
        System.out.println("Monto Total: " + montoVentaTotal);
    }
}
