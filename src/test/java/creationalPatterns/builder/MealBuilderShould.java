package creationalPatterns.builder;

import creationalPatterns.builder.mealsBuilder.builders.DailyMenuBuilder;
import creationalPatterns.builder.mealsBuilder.builders.KidsMenuBuilder;
import creationalPatterns.builder.mealsBuilder.builders.MealBuilder;
import creationalPatterns.builder.mealsBuilder.builders.WeekendMenuBuilder;
import creationalPatterns.builder.mealsBuilder.director.Director;
import creationalPatterns.builder.mealsBuilder.menu.DailyMenu;
import creationalPatterns.builder.mealsBuilder.menu.WeekendMenu;
import org.junit.Test;

import static creationalPatterns.builder.mealsBuilder.components.Dessert.PUDDING;
import static creationalPatterns.builder.mealsBuilder.components.MainDish.FISH;
import static creationalPatterns.builder.mealsBuilder.components.SideDish.VEGETABLES;
import static org.assertj.core.api.Assertions.assertThat;

public class MealBuilderShould {
    Director director = new Director();

    @Test
    public void create_daily_meal() {
        DailyMenuBuilder builder = new DailyMenuBuilder();

        director.createDailyMenu(builder);
        DailyMenu dailyMenu = builder.getMenu();

        assertThat(dailyMenu.getDessert()).isEqualTo(PUDDING);
    }


    @Test
    public void create_weekend_meal_mum() {
        WeekendMenuBuilder weekendMenuBuilder = new WeekendMenuBuilder();

        director.createWeekendMenuMum(weekendMenuBuilder);
        WeekendMenu weekendMenu = weekendMenuBuilder.getMenu();

        assertThat(weekendMenu.getFirstDish().getMain()).isEqualTo(FISH);
        assertThat(weekendMenu.getFirstDish().getSide()).isEqualTo(VEGETABLES);
    }
}
