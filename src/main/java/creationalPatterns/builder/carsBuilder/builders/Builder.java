package creationalPatterns.builder.carsBuilder.builders;

import creationalPatterns.builder.carsBuilder.cars.CarType;
import creationalPatterns.builder.carsBuilder.components.Engine;
import creationalPatterns.builder.carsBuilder.components.GPSNavigator;
import creationalPatterns.builder.carsBuilder.components.Transmission;
import creationalPatterns.builder.carsBuilder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}