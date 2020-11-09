package creationalPatterns.factoryMethod.shapesInterface;

public class Triangle implements Figure {

    @Override
    public void shape() {
        System.out.println("Hello, I am a triangle");
    }
}