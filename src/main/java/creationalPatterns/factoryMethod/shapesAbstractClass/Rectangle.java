package creationalPatterns.factoryMethod.shapesAbstractClass;

public class Rectangle extends Figure {

    @Override
    public double getArea() {
        return getBase() * getHeight();
    }
}
