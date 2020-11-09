package creationalPatterns.factoryMethod.shapesAbstractClass;

public class Triangle extends Figure {

    @Override
    public float getArea() {
        return getBase() * getHeight() / 2;
    }
}
