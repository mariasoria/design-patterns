package creationalPatterns.builder.pizzaRestaurant.builder;

public interface PizzaBuilder {
    void addDough(String dough);
    void addSauce(String sauce);
    void addTopping(String topping);
}
