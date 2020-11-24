package creationalPatterns.abstractMethod.factoriaCoches;

public class FabricaBerlinas implements Fabricante {

    public Coche crearCoche() {
        return new Berlina();
    }
}
