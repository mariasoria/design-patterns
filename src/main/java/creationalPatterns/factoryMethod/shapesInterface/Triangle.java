package creationalPatterns.factoryMethod.shapesInterface;

public class Triangle implements Figure {
    @Override
    public String shape() {
        return "Hello, I am a triangle";
    }
}