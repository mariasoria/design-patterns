package creationalPatterns.abstractMethod.factoriaCoches;

public class Berlina implements Coche {

    @Override
    public float getVelocidad() {
        return 0;
    }

    @Override
    public String getTipo() {
        return "Berlina";
    }

    @Override
    public boolean arrancar() {
        return false;
    }

    @Override
    public float acelerar() {
        return 0;
    }

    @Override
    public float frenar() {
        return 0;
    }

}
