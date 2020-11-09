package creationalPatterns.factoryMethod.factura;

public class Principal {

    public static void main(String[] args) {
        Factura f = FactoriaFacturas.getFactura("iva");
        f.setId(1);
        f.setImporte(100);
        System.out.println("Importe IVA: " + f.getImporteIva());
    }
}
