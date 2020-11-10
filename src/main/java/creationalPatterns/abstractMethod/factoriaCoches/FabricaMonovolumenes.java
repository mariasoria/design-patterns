package creationalPatterns.abstractMethod.factoriaCoches;

public class FabricaMonovolumenes implements Fabricante {

    @Override
    public Coche crearCoche() {
        Monovolumen cocheMonovolumen = new Monovolumen();
        return cocheMonovolumen;
    }
}
