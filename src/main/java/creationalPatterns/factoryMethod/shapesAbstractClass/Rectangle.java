package creationalPatterns.factoryMethod.shapesAbstractClass;

public class Rectangle extends Figure {

    @Override
    public float getArea() {
        return getBase() * getHeight();
    }
}
