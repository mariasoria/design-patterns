package creationalPatterns.factoryMethod.shapesInterface;

public class Rectangle implements Figure {

    @Override
    public void shape() {
        System.out.println("Hello, I am a rectangle");
    }
}