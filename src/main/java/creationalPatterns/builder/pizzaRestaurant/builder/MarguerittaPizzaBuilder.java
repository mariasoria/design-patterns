package creationalPatterns.builder.pizzaRestaurant.builder;

import creationalPatterns.builder.pizzaRestaurant.pizzas.Pizza;

import java.util.ArrayList;

public class MarguerittaPizzaBuilder implements PizzaBuilder {
    private String dough;
    private String sauce;
    private ArrayList<String> toppings = new ArrayList<String>();
    private Pizza pizza = new Pizza();

    @Override
    public void addDough() {
        pizza.setDough("vegetal");
    }

    @Override
    public void addSauce() {
        pizza.setSauce("tomato");
    }

    @Override
    public void addTopping() {
        this.toppings.add("cheese");
        this.toppings.add("oregano");
        pizza.setToppings(this.toppings);
    }

    public Pizza makePizza() {
        return pizza;
    }
}
