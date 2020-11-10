package creationalPatterns.factoryMethod.shapesAbstractClass;

public class Triangle extends Figure {

    @Override
    public double getArea() {
        return getBase() * getHeight() / 2.0;
    }
}
