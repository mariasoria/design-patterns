package creationalPatterns.factoryMethod.shapesAbstractClass;

public class Main {
    public static void main(String[] args) {
        FactoryFigures factoryTriangle = new FactoryFigures();
        Figure triangle = factoryTriangle.getFigure("triangle");
        triangle.setName("triangle");
        triangle.setBase(10.0);
        triangle.setHeight(4.0);
        System.out.println("Hello, " + triangle.getName() + " and my area is " + triangle.getArea());

        FactoryFigures factoryRectangle = new FactoryFigures();
        Figure rectangle = factoryRectangle.getFigure("rectangle");
        rectangle.setName("rectangle");
        rectangle.setBase(4.0);
        rectangle.setHeight(2.0);
        System.out.println("Hello, " + rectangle.getName() + " and my area is "  + rectangle.getArea());

        FactoryFigures factoryCircle = new FactoryFigures();
        Figure circle = factoryCircle.getFigure("circle");
        circle.setName("circle");
        circle.setBase(20.0);
        circle.setHeight(2.0);
        System.out.println("Hello, " + circle.getName() + " and my area is "  + circle.getArea());
    }
}
