package creationalPatterns.builder;

import creationalPatterns.builder.carsBuilder.builders.CarBuilder;
import creationalPatterns.builder.carsBuilder.builders.CarManualBuilder;
import creationalPatterns.builder.carsBuilder.cars.Car;
import creationalPatterns.builder.carsBuilder.cars.Manual;
import creationalPatterns.builder.carsBuilder.director.Director;
import org.junit.Test;

import static creationalPatterns.builder.carsBuilder.cars.CarType.*;
import static creationalPatterns.builder.carsBuilder.components.Transmission.*;
import static org.assertj.core.api.Assertions.assertThat;

public class CarBuilderShould {

    @Test
    public void should_build_a_sports_car() {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();

        director.constructSportsCar(builder);
        Car sportsCar = builder.getResult();

        assertThat(sportsCar.getCarType()).isEqualTo(SPORTS_CAR);
        assertThat(sportsCar.getEngine().getVolume()).isEqualTo(3.0);
        assertThat(sportsCar.getEngine().getMileage()).isEqualTo(0.0);
        assertThat(sportsCar.getTransmission()).isEqualTo(SEMI_AUTOMATIC);
        assertThat(sportsCar.getGpsNavigator().getRoute()).isEqualTo("221b, Baker Street, London to Scotland Yard, 8-10 Broadway, London");
    }

    @Test
    public void should_build_a_city_car() {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();

        director.constructCityCar(builder);
        Car cityCar = builder.getResult();

        assertThat(cityCar.getCarType()).isEqualTo(CITY_CAR);
        assertThat(cityCar.getSeats()).isEqualTo(2);
        assertThat(cityCar.getEngine().getVolume()).isEqualTo(1.2);
        assertThat(cityCar.getEngine().getMileage()).isEqualTo(0.0);
        assertThat(cityCar.getTransmission()).isEqualTo(AUTOMATIC);
        assertThat(cityCar.getGpsNavigator().getRoute()).isEqualTo("221b, Baker Street, London to Scotland Yard, 8-10 Broadway, London");
    }


    @Test
    public void should_build_a_SUV_Manual_car() {
        Director director = new Director();
        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSUV(manualBuilder);
        Manual suvCar = manualBuilder.getResult();

        assertThat(suvCar.getCarType()).isEqualTo(SUV);
        assertThat(suvCar.getSeats()).isEqualTo(4);
        assertThat(suvCar.getEngine().getVolume()).isEqualTo(2.5);
        assertThat(suvCar.getEngine().getMileage()).isEqualTo(0.0);
        assertThat(suvCar.getTransmission()).isEqualTo(MANUAL);
        assertThat(suvCar.getGpsNavigator().getRoute()).isEqualTo("221b, Baker Street, London to Scotland Yard, 8-10 Broadway, London");
    }

    @Test
    public void should_build_a_manual_city_car() {
        Director director = new Director();
        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructManualCityCar(manualBuilder);
        Manual manualCar = manualBuilder.getResult();

        assertThat(manualCar.getCarType()).isEqualTo(CITY_CAR);
        assertThat(manualCar.getSeats()).isEqualTo(5);
        assertThat(manualCar.getEngine().getVolume()).isEqualTo(1.6);
        assertThat(manualCar.getEngine().getMileage()).isEqualTo(0.0);
        assertThat(manualCar.getTransmission()).isEqualTo(MANUAL);
        assertThat(manualCar.getGpsNavigator().getRoute()).isEqualTo("221b, Baker Street, London to Scotland Yard, 8-10 Broadway, London");

    }


}
