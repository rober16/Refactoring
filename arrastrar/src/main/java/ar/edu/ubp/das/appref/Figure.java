package ar.edu.ubp.das.appref;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;

public class Figure {
    private RectangularShape shape1;
    private RectangularShape shape2;

    public Figure() {
        shape1 = new Rectangle2D.Double(1, 1, 100, 100);
        shape2 = new Ellipse2D.Double(1, 1, 100, 100);
    }

    public RectangularShape getShape1() {
        return shape1;
    }

    public RectangularShape getShape2() {
        return shape2;
    }
}