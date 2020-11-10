package creationalPatterns.abstractMethod.furnitureFactory;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FurnitureAbstractFactoryShould {

    @Test
    public void should_return_modern_chair () {
        assertThat(Main.createFurniture("Modern", "Chair")).isEqualTo("ModernChair");
    }

    @Test
    public void should_return_modern_coffeeTable () {
        assertThat(Main.createFurniture("Modern", "CoffeeTable")).isEqualTo("ModernCoffeeTable");
    }

    @Test
    public void should_return_modern_sofa () {
        assertThat(Main.createFurniture("Modern", "Sofa")).isEqualTo("ModernSofa");
    }

    @Test
    public void should_return_artDeco_chair () {
        assertThat(Main.createFurniture("ArtDeco", "Chair")).isEqualTo("ArtDecoChair");
    }

    @Test
    public void should_return_artDeco_coffeeTable () {
        assertThat(Main.createFurniture("ArtDeco", "CoffeeTable")).isEqualTo("ArtDecoCoffeeTable");
    }

    @Test
    public void should_return_artDeco_sofa () {
        assertThat(Main.createFurniture("ArtDeco", "Sofa")).isEqualTo("ArtDecoSofa");
    }

    @Test
    public void should_return_victorian_chair () {
        assertThat(Main.createFurniture("Victorian", "Chair")).isEqualTo("VictorianChair");
    }

    @Test
    public void should_return_victorian_coffeeTable () {
        assertThat(Main.createFurniture("Victorian", "CoffeeTable")).isEqualTo("VictorianCoffeeTable");
    }

    @Test
    public void should_return_victorian_sofa () {
        assertThat(Main.createFurniture("Victorian", "Sofa")).isEqualTo("VictorianSofa");
    }
}
