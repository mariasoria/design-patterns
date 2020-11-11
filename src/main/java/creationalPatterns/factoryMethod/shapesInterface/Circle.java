package creationalPatterns.factoryMethod.shapesInterface;

public class Circle implements  Figure {
    @Override
    public String shape() {
        return "Hello, I am a circle";
    }
}