package creationalPatterns.abstractMethod.factoriaCoches;

public class FactoriaAbstractDeCoches {
    Fabricante fabricante;

    public FactoriaAbstractDeCoches(Fabricante fab) {
        this.fabricante = fab;
    }

    public void setFabrica(Fabricante fab) {
        this.fabricante = fab;
    }

    public Coche crearCoche() {
        return this.fabricante.crearCoche();
    }
}
