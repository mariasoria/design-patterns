package creationalPatterns.builder.mealsBuilder.builders;

import creationalPatterns.builder.mealsBuilder.components.*;
import creationalPatterns.builder.mealsBuilder.menu.WeekendMenu;

public class WeekendMenuBuilder implements MealBuilder {
    private Dish firstDish;
    private Dish secondDish;
    private Drink drink;
    private Dessert dessert;
    private Toy toy;

    @Override
    public void setFirstDish(Dish mainDish) {
        this.firstDish = mainDish;
    }

    @Override
    public void setSecondDish(Dish secondDish) {
        this.secondDish = secondDish;
    }

    @Override
    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    @Override
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public void setToy(Toy toy) {
        this.toy = toy;
    }

    public WeekendMenu getMenu() {
        return new WeekendMenu(firstDish, secondDish, drink, dessert, toy);
    }
}
