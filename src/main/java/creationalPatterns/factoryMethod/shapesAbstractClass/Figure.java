package creationalPatterns.factoryMethod.shapesAbstractClass;

public abstract class Figure {
    private float base;
    private float height;
    private String name;

    public abstract float getArea();

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getName() {
        return "I am a " + this.name;
    };

    public void setName(String name) {
        this.name = name;
    }
}
