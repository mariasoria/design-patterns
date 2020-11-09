package creationalPatterns.factoryMethod.shapesInterface;

public class Main {
    public static void main(String[] args) {
        FigureFactory figure  = new FigureFactory();
        Figure circle = figure.getShape("circle");
        circle.shape();

        FigureFactory figure2  = new FigureFactory();
        Figure triangle = figure2.getShape("triangle");
        triangle.shape();

        FigureFactory figure3  = new FigureFactory();
        Figure rectangle = figure3.getShape("rectangle");
        rectangle.shape();
    }
}
