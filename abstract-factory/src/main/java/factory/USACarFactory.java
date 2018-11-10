package factory;

import enums.CarType;
import enums.Location;
import models.Car;
import models.LuxuryCar;
import models.MicroCar;
import models.MiniCar;

/**
 * Created by Asim on 11/4/2018.
 */
public class USACarFactory {

    public static Car buildCar(CarType model)
    {
        Car car = null;
        switch (model)
        {
            case MICRO:
                car = new MicroCar(Location.USA);
                break;
            case MINI:
                car = new MiniCar(Location.USA);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.USA);
                break;
            default:
                break;
        }
        return car;
    }
}
