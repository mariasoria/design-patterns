package creationalPatterns.abstractMethod.factoriaCoches;

public class FabricaMonovolumenes implements Fabricante {

    @Override
    public Coche crearCoche() {
        return new Monovolumen();
    }
}
