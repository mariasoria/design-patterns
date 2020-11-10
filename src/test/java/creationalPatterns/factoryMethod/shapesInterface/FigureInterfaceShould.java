package creationalPatterns.factoryMethod.shapesInterface;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class FigureInterfaceShould {

    @Test
    public void should_return_I_am_a_triangle() {
        FigureFactory figure2  = new FigureFactory();
        Figure triangle = figure2.getShape("triangle");

        assertThat(triangle.shape()).isEqualTo("Hello, I am a triangle");
    }

    @Test
    public void should_return_I_am_a_rectangle() {
        FigureFactory figure3  = new FigureFactory();
        Figure rectangle = figure3.getShape("rectangle");

        assertThat(rectangle.shape()).isEqualTo("Hello, I am a rectangle");
    }

    @Test
    public void should_return_I_am_a_circle() {
        FigureFactory figure  = new FigureFactory();
        Figure circle = figure.getShape("circle");

        assertThat(circle.shape()).isEqualTo("Hello, I am a circle");
    }
}
