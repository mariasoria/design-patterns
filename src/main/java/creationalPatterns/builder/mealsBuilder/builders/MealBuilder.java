package creationalPatterns.builder.mealsBuilder.builders;

import creationalPatterns.builder.mealsBuilder.components.Dessert;
import creationalPatterns.builder.mealsBuilder.components.Dish;
import creationalPatterns.builder.mealsBuilder.components.Drink;
import creationalPatterns.builder.mealsBuilder.components.Toy;

public interface MealBuilder {
    void setFirstDish(Dish mainDish);
    void setSecondDish(Dish mainDish);
    void setDrink(Drink drink);
    void setDessert(Dessert dessert);
    void setToy(Toy toy);
}
