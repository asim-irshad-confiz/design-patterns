package factory;

import enums.CarType;
import enums.Location;
import models.Car;

/**
 * Created by Asim on 11/4/2018.
 */
public class CarFactory
{
    private CarFactory() {}
    public static Car buildCar(CarType type)
    {
        Car car;
        Location location = Location.PAKISTAN;

        switch(location)
        {
            case USA:
                car = USACarFactory.buildCar(type);
                break;
            case PAKISTAN:
                car = PakistanCarFactory.buildCar(type);
                break;
            default:
                car = DefaultCarFactory.buildCar(type);
        }
        return car;
    }
}
