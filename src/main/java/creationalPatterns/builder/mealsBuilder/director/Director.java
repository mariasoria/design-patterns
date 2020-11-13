package creationalPatterns.builder.mealsBuilder.director;

import creationalPatterns.builder.mealsBuilder.builders.MealBuilder;
import creationalPatterns.builder.mealsBuilder.components.Dish;

import static creationalPatterns.builder.mealsBuilder.components.Dessert.*;
import static creationalPatterns.builder.mealsBuilder.components.Drink.*;
import static creationalPatterns.builder.mealsBuilder.components.MainDish.*;
import static creationalPatterns.builder.mealsBuilder.components.SideDish.*;
import static creationalPatterns.builder.mealsBuilder.components.Toy.*;

public class Director {

    public void createDailyMenu(MealBuilder builder) {
        builder.setFirstDish(new Dish(FISH, CHIPS));
        builder.setDrink(SOFT_DRINK);
        builder.setDessert(PUDDING);
    }

    public void createKidsMenu(MealBuilder builder) {
        builder.setFirstDish(new Dish(BURGER, MASH_POTATOES));
        builder.setDrink(JUICE);
        builder.setDessert(ICE_CREAM);
        builder.setToy(FIGURE);
    }

    public void createWeekendMenuMum(MealBuilder builder) {
        builder.setFirstDish(new Dish(FISH, VEGETABLES));
        builder.setSecondDish(new Dish(KEBAB, SALAD));
        builder.setDrink(BEER);
        builder.setDessert(FRUIT);
    }

    public void createWeekendMenuDad(MealBuilder builder) {
        builder.setFirstDish(new Dish(PIZZA, SALAD));
        builder.setDrink(TEA);
        builder.setDessert(APPLE_CRUMBLE);
    }
}
