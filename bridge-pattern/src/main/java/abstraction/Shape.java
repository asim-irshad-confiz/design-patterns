package abstraction;

import implementor.Color;

/**
 * Created by Asim on 11/10/2018.
 */
public abstract class Shape {

    protected Color color;
    public Shape(Color color) {
        this.color = color;
    }

    abstract public void draw();
}
