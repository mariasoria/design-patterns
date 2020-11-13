package creationalPatterns.builder.mealsBuilder.components;

public class Dish {
    private MainDish main;
    private SideDish side;

    public Dish(MainDish main, SideDish side) {
        this.main = main;
        this.side = side;
    }

    public MainDish getMain() {
        return main;
    }

    public void setMain(MainDish main) {
        this.main = main;
    }

    public SideDish getSide() {
        return side;
    }

    public void setSide(SideDish side) {
        this.side = side;
    }
}
