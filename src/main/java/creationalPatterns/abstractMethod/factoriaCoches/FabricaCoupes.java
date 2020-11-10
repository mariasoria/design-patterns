package creationalPatterns.abstractMethod.factoriaCoches;

public class FabricaCoupes implements Fabricante {

    @Override
    public Coche crearCoche() {
        Coupe cocheCoupe = new Coupe();
        return cocheCoupe;
    }
}
