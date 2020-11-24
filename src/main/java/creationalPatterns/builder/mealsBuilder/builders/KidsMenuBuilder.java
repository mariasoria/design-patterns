package creationalPatterns.builder.mealsBuilder.builders;

import creationalPatterns.builder.mealsBuilder.components.*;
import creationalPatterns.builder.mealsBuilder.menu.KidsMenu;

public class KidsMenuBuilder implements MealBuilder {
    private Dish mainDish;
    private Dessert dessert;
    private Drink drink;
    private Toy toy;

    @Override
    public void setFirstDish(Dish mainDish) {
        this.mainDish = mainDish;
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
        this.toy = toy;
    }

    public KidsMenu getMenu() {
        return new KidsMenu(mainDish, drink, dessert, toy);
    }
}
