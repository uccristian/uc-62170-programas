package programasSemana02.colores;

public class ColorBox {
    private final String codUtil;
    public String descripUtil;
    public double precioUni;
    private final String marca;
    private final int unidadesCaja;
    public int cantidadVendida;
    private final int codOferta;
    public char descripcionOferta;
    private double porcDescto;

    public ColorBox(String codUtil, String marca, int unidadesCaja, int codOferta) {
        this.codUtil = codUtil;
        this.marca = marca;
        this.unidadesCaja = unidadesCaja;
        this.codOferta = codOferta;
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
        double montoDescuento = 0;

        switch(descripcionOferta) {
            case 'A' -> {
                porcDescto = 0.05;
            }
            case 'B' -> {
                porcDescto = 0.1;
            }
            case 'C' -> {
                porcDescto = 0.15;
            }
        }

        montoDescuento = monto - (monto * porcDescto);
        double montoVentaTotal = monto - montoDescuento;
        System.out.println("Monto Total: " + montoVentaTotal);
    }
}
