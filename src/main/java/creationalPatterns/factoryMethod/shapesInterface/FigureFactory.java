package creationalPatterns.factoryMethod.shapesInterface;

public class FigureFactory {
    public Figure getShape(String figureType) {
        if(figureType.equals("triangle")) {
            return new Triangle();
        } else if (figureType.equals("rectangle")) {
            return new Rectangle();
        } else return new Circle();
    }
}