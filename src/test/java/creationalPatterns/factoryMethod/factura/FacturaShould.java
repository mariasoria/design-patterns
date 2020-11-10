package creationalPatterns.factoryMethod.factura;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FacturaShould {

    @Test
    public void should_return_importe_iva() {
        Factura f = FactoriaFacturas.getFactura("iva");
        f.setId(1);
        f.setImporte(100);

        assertThat(f.getImporteIva()).isEqualTo(121.0);
    }

    @Test
    public void should_return_importe_iva_reducido() {
        Factura f = FactoriaFacturas.getFactura("");
        f.setId(1);
        f.setImporte(100);

        assertThat(f.getImporteIva()).isEqualTo(107.0);
    }
}
