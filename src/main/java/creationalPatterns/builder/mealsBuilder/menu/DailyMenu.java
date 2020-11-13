package creationalPatterns.builder.mealsBuilder.menu;

import creationalPatterns.builder.mealsBuilder.components.*;

public class DailyMenu {
    private Dish dish;
    private Drink drink;
    private Dessert dessert;

    public DailyMenu(Dish dish, Drink drink, Dessert dessert) {
        this.dish = dish;
        this.drink = drink;
        this.dessert = dessert;
    }

    public Drink getDrink() {
        return drink;
    }

    public Dessert getDessert() {
        return dessert;
    }
}
