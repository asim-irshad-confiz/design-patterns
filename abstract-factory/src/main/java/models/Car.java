package models;

import enums.CarType;
import enums.Location;

/**
 * Created by Asim on 11/4/2018.
 */
public abstract class Car {
    private CarType model = null;
    private Location location = null;

    public Car(CarType model, Location location) {
        this.model = model;
        this.location = location;
    }

    public abstract void construct();

    @Override
    public String toString() {
        return "CarModel - " + model + " located in " + location;
    }
}
