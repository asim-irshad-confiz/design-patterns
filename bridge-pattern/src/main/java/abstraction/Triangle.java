package abstraction;

import implementor.Color;

/**
 * Created by Asim on 11/10/2018.
 */
public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }
    public void draw() {
        System.out.println("Drawing Triangle");
        color.applyColor();
    }
}
