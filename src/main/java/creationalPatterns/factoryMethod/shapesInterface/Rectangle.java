package creationalPatterns.factoryMethod.shapesInterface;

public class Rectangle implements Figure {

    @Override
    public String shape() {
        return "Hello, I am a rectangle";
    }
}