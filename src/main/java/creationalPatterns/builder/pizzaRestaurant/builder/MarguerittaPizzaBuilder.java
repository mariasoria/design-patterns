package creationalPatterns.builder.pizzaRestaurant.builder;

import creationalPatterns.builder.pizzaRestaurant.pizzas.Pizza;

import java.util.ArrayList;

public class MarguerittaPizzaBuilder implements PizzaBuilder {
    private String dough;
    private String sauce;
    private ArrayList<String> toppings = new ArrayList<String>();

    @Override
    public void addDough(String dough) {
        this.dough = dough;
    }

    @Override
    public void addSauce(String sauce) {
        this.sauce = sauce;
    }

    @Override
    public void addTopping(String topping) {
        this.toppings.add(topping);
    }

    public Pizza makePizza() {
        return new Pizza (dough, sauce, toppings);
    }
}
