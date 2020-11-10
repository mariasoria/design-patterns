package creationalPatterns.abstractMethod.factoriaCoches;

public class FabricaBerlinas implements Fabricante {

    public Coche crearCoche() {
        Berlina cocheBerlina = new Berlina();
        return cocheBerlina;
    }
}
