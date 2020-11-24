package creationalPatterns.builder.mealsBuilder.builders;

import creationalPatterns.builder.mealsBuilder.components.*;
import creationalPatterns.builder.mealsBuilder.menu.Menu;

import static creationalPatterns.builder.mealsBuilder.components.Dessert.ICE_CREAM;
import static creationalPatterns.builder.mealsBuilder.components.Drink.JUICE;
import static creationalPatterns.builder.mealsBuilder.components.MainDish.BURGER;
import static creationalPatterns.builder.mealsBuilder.components.SideDish.MASH_POTATOES;
import static creationalPatterns.builder.mealsBuilder.components.Toy.FIGURE;

public class KidsMenuBuilder implements MealBuilder {
    private Menu menu = new Menu();

    @Override
    public void setFirstDish() {
        menu.setFirstDish(new Dish(BURGER, MASH_POTATOES));
    }

    @Override
    public void setDrink() {
        menu.setDrink(JUICE);
    }

    @Override
    public void setDessert() {
        menu.setDessert(ICE_CREAM);
    }

    @Override
    public void setToy() {
        menu.setToy(FIGURE);
    }

    public Menu getMenu() {
        return menu;
    }

}
