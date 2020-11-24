package creationalPatterns.builder.pizzaRestaurant.pizzas;

import java.util.ArrayList;

public class FourCheesePizza {
    private String dough;
    private String sauce;
    private ArrayList<String> toppings;

    public FourCheesePizza(String dough, String sauce, ArrayList<String> toppings) {
        this.dough = dough;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }
}
