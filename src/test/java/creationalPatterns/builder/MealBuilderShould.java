package creationalPatterns.builder;

import creationalPatterns.builder.mealsBuilder.builders.DailyMenuBuilder;
import creationalPatterns.builder.mealsBuilder.builders.KidsMenuBuilder;
import creationalPatterns.builder.mealsBuilder.builders.WeekendMenuBuilder;
import creationalPatterns.builder.mealsBuilder.director.Director;
import creationalPatterns.builder.mealsBuilder.menu.Menu;
import org.junit.Test;

import static creationalPatterns.builder.mealsBuilder.components.Dessert.PUDDING;
import static creationalPatterns.builder.mealsBuilder.components.MainDish.BURGER;
import static creationalPatterns.builder.mealsBuilder.components.MainDish.KEBAB;
import static creationalPatterns.builder.mealsBuilder.components.SideDish.MASH_POTATOES;
import static creationalPatterns.builder.mealsBuilder.components.SideDish.VEGETABLES;
import static org.assertj.core.api.Assertions.assertThat;

public class MealBuilderShould {
    Director director = new Director();

    @Test
    public void create_daily_meal() {
        DailyMenuBuilder builder = new DailyMenuBuilder();

        director.createDailyMenu(builder);
        Menu dailyMenu = builder.getMenu();

        assertThat(dailyMenu.getDessert()).isEqualTo(PUDDING);
    }


    @Test
    public void create_weekend_meal() {
        WeekendMenuBuilder weekendMenuBuilder = new WeekendMenuBuilder();

        director.createWeekendMenu(weekendMenuBuilder);
        Menu weekendMenu = weekendMenuBuilder.getMenu();

        assertThat(weekendMenu.getFirstDish().getMain()).isEqualTo(KEBAB);
        assertThat(weekendMenu.getFirstDish().getSide()).isEqualTo(VEGETABLES);
    }

    @Test
    public void create_kids_menu() {
        KidsMenuBuilder kidsMenuBuilder = new KidsMenuBuilder();

        director.createKidsMenu(kidsMenuBuilder);
        Menu weekendMenu = kidsMenuBuilder.getMenu();

        assertThat(weekendMenu.getFirstDish().getMain()).isEqualTo(BURGER);
        assertThat(weekendMenu.getFirstDish().getSide()).isEqualTo(MASH_POTATOES);
    }
}
