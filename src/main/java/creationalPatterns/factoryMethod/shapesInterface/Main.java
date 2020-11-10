package creationalPatterns.factoryMethod.shapesInterface;

public class Main {
    public static void main(String[] args) {
        FigureFactory figure  = new FigureFactory();
        Figure circle = figure.getShape("circle");
        System.out.println(circle.shape());

        FigureFactory figure2  = new FigureFactory();
        Figure triangle = figure2.getShape("triangle");
        System.out.println(triangle.shape());

        FigureFactory figure3  = new FigureFactory();
        Figure rectangle = figure3.getShape("rectangle");
        System.out.println(rectangle.shape());
    }
}
