package creationalPatterns.abstractMethod.factoriaCoches;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FactoriaAbstractDeCochesShould {

    @Test
    public void should_create_a_Berlina() {
        FactoriaAbstractDeCoches fabrica = new FactoriaAbstractDeCoches(new FabricaBerlinas());
        Coche berlina = fabrica.crearCoche();

        assertThat(berlina.getTipo()).isEqualTo("Berlina");
    }

    @Test
    public void should_create_a_Coupe() {
        FactoriaAbstractDeCoches fabrica = new FactoriaAbstractDeCoches(new FabricaCoupes());
        Coche coupe = fabrica.crearCoche();

        assertThat(coupe.getTipo()).isEqualTo("Coupe");
    }

    @Test
    public void should_create_a_Monovolumen() {
        FactoriaAbstractDeCoches fabrica = new FactoriaAbstractDeCoches(new FabricaMonovolumenes());
        Coche monovolumen = fabrica.crearCoche();

        assertThat(monovolumen.getTipo()).isEqualTo("Monovolumen");
    }
}
