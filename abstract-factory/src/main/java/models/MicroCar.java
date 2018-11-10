package models;

import enums.CarType;
import enums.Location;

/**
 * Created by Asim on 11/4/2018.
 */
public class MicroCar extends Car {

    public MicroCar(Location location) {
        super(CarType.MICRO, location);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Connecting to Micro Car ");
    }
}
