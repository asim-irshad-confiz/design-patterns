package models;

import enums.CarType;
import enums.Location;

/**
 * Created by Asim on 11/4/2018.
 */
public class MiniCar extends Car {

    public MiniCar(Location location) {
        super(CarType.MINI, location);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Connecting to Mini car");
    }
}
