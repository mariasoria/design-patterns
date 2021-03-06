package creationalPatterns.builder.pizzaRestaurant.director;

import creationalPatterns.builder.pizzaRestaurant.builders.PizzaBuilder;

public class Cook {

    public void makeMarguerittaPizza (PizzaBuilder builder) {
        builder.addDough();
        builder.addSauce();
        builder.addTopping();
    }

    public void makeFourCheesePizza (PizzaBuilder builder) {
        builder.addDough();
        builder.addSauce();
        builder.addTopping();
    }
}
