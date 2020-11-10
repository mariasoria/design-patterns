package creationalPatterns.factoryMethod.shapesAbstractClass;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FigureAbstractClassShould {

    @Test
    public void should_return_I_am_a_triangle() {
        FactoryFigures factoryTriangle = new FactoryFigures();
        Figure triangle = factoryTriangle.getFigure("triangle");
        triangle.setName("triangle");
        triangle.setBase(10.0);
        triangle.setHeight(4.0);

        assertThat(triangle.getName()).isEqualTo("I am a triangle");
        assertThat(triangle.getArea()).isEqualTo(20.0);
    }

    @Test
    public void should_return_I_am_a_rectangle() {
        FactoryFigures factoryRectangle = new FactoryFigures();
        Figure rectangle = factoryRectangle.getFigure("rectangle");
        rectangle.setName("rectangle");
        rectangle.setBase(4.0);
        rectangle.setHeight(2.0);

        assertThat(rectangle.getName()).isEqualTo("I am a rectangle");
        assertThat(rectangle.getArea()).isEqualTo(8.0);
    }

    @Test
    public void should_return_I_am_a_circle() {
        FactoryFigures factoryCircle = new FactoryFigures();
        Figure circle = factoryCircle.getFigure("circle");
        circle.setName("circle");
        circle.setBase(20.0);
        circle.setHeight(2.0);

        assertThat(circle.getName()).isEqualTo("I am a circle");
        assertThat(circle.getArea()).isEqualTo(40.0);
    }
}
