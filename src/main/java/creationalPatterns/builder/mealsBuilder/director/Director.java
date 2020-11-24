package creationalPatterns.builder.mealsBuilder.director;

import creationalPatterns.builder.mealsBuilder.builders.MealBuilder;

public class Director {

    public void createDailyMenu(MealBuilder builder) {
        builder.setFirstDish();
        builder.setDrink();
        builder.setDessert();
    }

    public void createKidsMenu(MealBuilder builder) {
        builder.setFirstDish();
        builder.setDrink();
        builder.setDessert();
        builder.setToy();
    }

    public void createWeekendMenu(MealBuilder builder) {
        builder.setFirstDish();
        builder.setDrink();
        builder.setDessert();
    }
}
