package creationalPatterns.builder.mealsBuilder.menu;

import creationalPatterns.builder.mealsBuilder.components.*;

public class KidsMenu {
    private Dish firstDish;
    private Drink drink;
    private Dessert dessert;
    private Toy toy;

    public KidsMenu(Dish firstDish, Drink drink, Dessert dessert, Toy toy) {
        this.firstDish = firstDish;
        this.drink = drink;
        this.dessert = dessert;
        this.toy = toy;
    }

    public Dish getFirstDish() {
        return firstDish;
    }

    public Drink getDrink() {
        return drink;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public Toy getToy() {
        return toy;
    }
}
