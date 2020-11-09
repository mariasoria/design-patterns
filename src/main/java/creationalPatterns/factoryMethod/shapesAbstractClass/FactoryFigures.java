package creationalPatterns.factoryMethod.shapesAbstractClass;

public class FactoryFigures {
    // instances one object or the other depending on the specified type
    public Figure getFigure(String type) {
        if (type.equals("triangle")) {
            return new Triangle();
        } else {
            return new Rectangle();
        }
    }
}
