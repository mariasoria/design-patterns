package creationalPatterns.builder.pizzaRestaurant.director;

import creationalPatterns.builder.pizzaRestaurant.builder.PizzaBuilder;

public class Cook {

    public void makeMarguerittaPizza (PizzaBuilder builder) {
        builder.addDough("vegetal");
        builder.addSauce("tomato");
        builder.addTopping("cheese");
        builder.addTopping("oregano");
    }

    public void makeFourCheesePizza (PizzaBuilder builder) {
        builder.addDough("wheat");
        builder.addSauce("tomato");
        builder.addTopping("blue cheese");
        builder.addTopping("emmental cheese");
        builder.addTopping("brie cheese");
        builder.addTopping("bryndza cheese");
    }
}
