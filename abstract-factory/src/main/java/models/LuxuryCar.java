package models;

import enums.CarType;
import enums.Location;

/**
 * Created by Asim on 11/4/2018.
 */
public class LuxuryCar extends Car {

    public LuxuryCar(Location location) {
        super(CarType.LUXURY, location);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Connecting to luxury car");
    }
}
