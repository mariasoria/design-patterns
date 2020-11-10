package creationalPatterns.factoryMethod.shapesAbstractClass;

public abstract class Figure {
    private double base;
    private double height;
    private String name;

    public abstract double getArea();

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return "I am a " + this.name;
    };

    public void setName(String name) {
        this.name = name;
    }
}
