package creationalPatterns.builder.mealsBuilder.menu;

import creationalPatterns.builder.mealsBuilder.components.*;

public class Menu {
    private Dish firstDish;
    private Dish secondDish;
    private Drink drink;
    private Dessert dessert;
    private Toy toy;

    public Menu() {}

    public Dish getFirstDish() {
        return firstDish;
    }

    public void setFirstDish(Dish firstDish) {
        this.firstDish = firstDish;
    }

    public Dish getSecondDish() {
        return secondDish;
    }

    public void setSecondDish(Dish secondDish) {
        this.secondDish = secondDish;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    public Toy getToy() {
        return toy;
    }

    public void setToy(Toy toy) {
        this.toy = toy;
    }
}
