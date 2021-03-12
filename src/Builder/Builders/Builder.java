package Builder.Builders;

import Builder.Components.Engine;
import Builder.Components.GPSNavigator;
import Builder.Components.Transmission;
import Builder.Components.TripComputer;
import Builder.cars.CarType;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
