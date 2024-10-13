package ar.edu.ubp.das.appref;

import java.awt.Shape;
import java.awt.Color;

public class Figure {
    private Shape shape;
    private Color color;

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Figure(Shape shape, Color color){
        this.shape = shape;
        this.color = color;
    }
}
