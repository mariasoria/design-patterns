package creationalPatterns.builder.mealsBuilder.builders;

import creationalPatterns.builder.mealsBuilder.components.Dessert;
import creationalPatterns.builder.mealsBuilder.components.Dish;
import creationalPatterns.builder.mealsBuilder.components.Drink;
import creationalPatterns.builder.mealsBuilder.components.Toy;
import creationalPatterns.builder.mealsBuilder.menu.Menu;

import static creationalPatterns.builder.mealsBuilder.components.Dessert.PUDDING;
import static creationalPatterns.builder.mealsBuilder.components.Drink.SOFT_DRINK;
import static creationalPatterns.builder.mealsBuilder.components.MainDish.FISH;
import static creationalPatterns.builder.mealsBuilder.components.SideDish.CHIPS;
import static creationalPatterns.builder.mealsBuilder.components.Toy.FIGURE;

public class DailyMenuBuilder implements MealBuilder {
    private Dish dish;
    private Drink drink;
    private Dessert dessert;
    private Toy toy;
    private Menu menu = new Menu();

    @Override
    public void setFirstDish() {
        menu.setFirstDish(new Dish(FISH, CHIPS));
    }

    @Override
    public void setDrink() {
        menu.setDrink(SOFT_DRINK);
    }

    @Override
    public void setDessert() {
        menu.setDessert(PUDDING);
    }

    @Override
    public void setToy() {
        menu.setToy(FIGURE);
    }

    public Menu getMenu() {
        return menu;
    }
}
