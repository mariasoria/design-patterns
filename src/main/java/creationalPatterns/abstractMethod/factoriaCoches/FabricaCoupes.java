package creationalPatterns.abstractMethod.factoriaCoches;

public class FabricaCoupes implements Fabricante {

    @Override
    public Coche crearCoche() {
        return new Coupe();
    }
}
