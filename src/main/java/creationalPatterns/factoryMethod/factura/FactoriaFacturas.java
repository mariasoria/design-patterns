package creationalPatterns.factoryMethod.factura;

public class FactoriaFacturas {
    // instancia un objeto u otro dependiendo del tipo que le solicitemos
    public static Factura getFactura(String tipo) {
        if (tipo.equals("iva")) {
            return new FacturaIva();
        }
        else {
            return new FacturaIvaReducido();
        }
    }
}
