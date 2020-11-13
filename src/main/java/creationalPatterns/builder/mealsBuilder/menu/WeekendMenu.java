package creationalPatterns.builder.mealsBuilder.menu;

import creationalPatterns.builder.mealsBuilder.components.*;

public class WeekendMenu {
    private Dish firstDish;
    private Dish secondDish;
    private Drink drink;
    private Dessert dessert;

    public WeekendMenu(Dish firstDish, Dish secondDish, Drink drink, Dessert dessert) {
        this.firstDish = firstDish;
        this.secondDish = secondDish;
        this.drink = drink;
        this.dessert = dessert;
    }

    public Dish getFirstDish() {
        return firstDish;
    }

    public Dish getSecondDish() {
        return secondDish;
    }

    public Drink getDrink() {
        return drink;
    }

    public Dessert getDessert() {
        return dessert;
    }
}
