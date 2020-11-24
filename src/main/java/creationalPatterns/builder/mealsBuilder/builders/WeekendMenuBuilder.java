package creationalPatterns.builder.mealsBuilder.builders;

import creationalPatterns.builder.mealsBuilder.components.*;
import creationalPatterns.builder.mealsBuilder.menu.Menu;

import static creationalPatterns.builder.mealsBuilder.components.Dessert.FRUIT;
import static creationalPatterns.builder.mealsBuilder.components.Drink.BEER;
import static creationalPatterns.builder.mealsBuilder.components.MainDish.KEBAB;
import static creationalPatterns.builder.mealsBuilder.components.SideDish.VEGETABLES;
import static creationalPatterns.builder.mealsBuilder.components.Toy.FIGURE;

public class WeekendMenuBuilder implements MealBuilder {
    private Menu menu = new Menu();

    @Override
    public void setFirstDish() {
        menu.setFirstDish(new Dish(KEBAB, VEGETABLES));
    }

    @Override
    public void setDrink() {
        menu.setDrink(BEER);
    }

    @Override
    public void setDessert() {
        menu.setDessert(FRUIT);
    }

    @Override
    public void setToy() {
        menu.setToy(FIGURE);
    }

    public Menu getMenu() {
        return menu;
    }

}
