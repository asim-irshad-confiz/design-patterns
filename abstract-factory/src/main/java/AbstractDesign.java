import enums.CarType;
import factory.CarFactory;

/**
 * Created by Asim on 11/4/2018.
 */
public class AbstractDesign {

    public static void main(String[] args)
    {
        System.out.println(CarFactory.buildCar(CarType.MICRO));
        System.out.println(CarFactory.buildCar(CarType.MINI));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
}
