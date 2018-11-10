import abstraction.Circle;
import abstraction.Shape;
import abstraction.Triangle;
import implementor.GreenColor;
import implementor.RedColor;

/**
 * Created by Asim on 11/10/2018.
 */
public class BridgeClient {

    public static void main(String[] args) {
        Shape circle = new Circle(new RedColor());
        circle.draw();

        Shape triangle = new Triangle(new GreenColor());
        triangle.draw();
    }
}
