package creationalPatterns.factoryMethod.shapesAbstractClass;

public class Main {
    public static void main(String[] args) {
        FactoryFigures factoryTriangle = new FactoryFigures();
        Figure triangle = factoryTriangle.getFigure("triangle");
        triangle.setName("triangle");
        triangle.setBase(4);
        triangle.setHeight(2);
        System.out.println("Hello, " + triangle.getName() + " and my area is " + triangle.getArea());

        FactoryFigures factoryRectangle = new FactoryFigures();
        Figure rectangle = factoryRectangle.getFigure("rectangle");
        rectangle.setName("rectangle");
        rectangle.setBase(4);
        rectangle.setHeight(2);
        System.out.println("Hello, " + rectangle.getName() + " and my area is "  + rectangle.getArea());
    }
}
