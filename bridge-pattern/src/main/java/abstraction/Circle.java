package abstraction;

import implementor.Color;

/**
 * Created by Asim on 11/10/2018.
 */
public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    public void draw() {
        System.out.println("Drawing Circle");
        color.applyColor();
    }
}
