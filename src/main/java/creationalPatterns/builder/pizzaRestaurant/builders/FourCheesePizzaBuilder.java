package creationalPatterns.builder.pizzaRestaurant.builders;

import creationalPatterns.builder.pizzaRestaurant.pizzas.Pizza;

import java.util.ArrayList;

public class FourCheesePizzaBuilder implements PizzaBuilder {
    private ArrayList<String> toppings = new ArrayList<>();
    private Pizza pizza = new Pizza();

    @Override
    public void addDough() {
        pizza.setDough("wheat");
    }

    @Override
    public void addSauce() {
        pizza.setSauce("tomato");
    }

    @Override
    public void addTopping() {
        this.toppings.add("blue cheese");
        this.toppings.add("emmental cheese");
        this.toppings.add("brie cheese");
        this.toppings.add("bryndza cheese");
        pizza.setToppings(this.toppings);
    }

    public Pizza makePizza() {
        return pizza;
    }

}
