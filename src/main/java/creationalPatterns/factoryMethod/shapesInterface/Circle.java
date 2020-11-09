package creationalPatterns.factoryMethod.shapesInterface;

public class Circle implements  Figure {

    @Override
    public void shape() {
        System.out.println("Hello, I am a circle");
    }
}