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
public class PakistanCarFactory {

    public static Car buildCar(CarType model)
    {
        Car car = null;
        switch (model)
        {
            case MICRO:
                car = new MicroCar(Location.PAKISTAN);
                break;
            case MINI:
                car = new MiniCar(Location.PAKISTAN);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.PAKISTAN);
                break;
            default:
                break;
        }
        return car;
    }
}
