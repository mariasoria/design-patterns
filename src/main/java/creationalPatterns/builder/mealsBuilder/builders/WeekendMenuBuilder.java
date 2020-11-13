package creationalPatterns.builder.mealsBuilder.builders;

import creationalPatterns.builder.mealsBuilder.components.*;
import creationalPatterns.builder.mealsBuilder.menu.WeekendMenu;

public class WeekendMenuBuilder implements MealBuilder {
    private Dish firstDish;
    private Dish secondDish;
    private Drink drink;
    private Dessert dessert;

    @Override
    public void setFirstDish(Dish mainDish) {
        this.firstDish = mainDish;
    }

    @Override
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public void setToy(Toy toy) {
    }

    @Override
    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public void setSecondDish(Dish secondDish) {
        this.secondDish = secondDish;
    }

    public WeekendMenu getMenu() {
        return new WeekendMenu(firstDish, secondDish, drink, dessert);
    }
}
