package creationalPatterns.builder;

import creationalPatterns.builder.pizzaRestaurant.builder.FourCheesePizzaBuilder;
import creationalPatterns.builder.pizzaRestaurant.builder.MarguerittaPizzaBuilder;
import creationalPatterns.builder.pizzaRestaurant.director.Cook;
import creationalPatterns.builder.pizzaRestaurant.pizzas.Pizza;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RestaurantShould {
    Cook director = new Cook();

    @Test
    public void should_create_a_margueritta_pizza() {
        MarguerittaPizzaBuilder pizzaMarguerittaBuilder = new MarguerittaPizzaBuilder();
        director.makeMarguerittaPizza(pizzaMarguerittaBuilder);

        Pizza pizza = pizzaMarguerittaBuilder.makePizza();
        assertThat(pizza.getDough()).isEqualTo("vegetal");
        assertThat(pizza.getSauce()).isEqualTo("tomato");
    }

    @Test
    public void should_create_a_four_cheese_pizza() {
        FourCheesePizzaBuilder pizzaFourCheeseBuilder = new FourCheesePizzaBuilder();
        director.makeFourCheesePizza(pizzaFourCheeseBuilder);

        Pizza pizza = pizzaFourCheeseBuilder.makePizza();
        assertThat(pizza.getDough()).isEqualTo("wheat");
        assertThat(pizza.getSauce()).isEqualTo("tomato");
    }
}
