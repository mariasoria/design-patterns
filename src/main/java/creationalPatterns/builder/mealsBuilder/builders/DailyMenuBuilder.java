package creationalPatterns.builder.mealsBuilder.builders;

import creationalPatterns.builder.mealsBuilder.components.*;
import creationalPatterns.builder.mealsBuilder.menu.DailyMenu;

public class DailyMenuBuilder implements MealBuilder {
    private Dish dish;
    private Drink drink;
    private Dessert dessert;

    @Override
    public void setFirstDish(Dish mainDish) {
        this.dish = mainDish;
    }

    @Override
    public void setSecondDish(Dish mainDish) {
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
    }

    public DailyMenu getMenu() {
        return new DailyMenu(dish, drink, dessert);
    }
}
