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
public class DefaultCarFactory {

    public static Car buildCar(CarType model)
    {
        Car car = null;
        switch (model)
        {
            case MICRO:
                car = new MicroCar(Location.DEFAULT);
                break;
            case MINI:
                car = new MiniCar(Location.DEFAULT);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.DEFAULT);
                break;
            default:
                break;
        }
        return car;
    }
}
