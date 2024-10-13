package ar.edu.ubp.das.appref;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.geom.RectangularShape;

public class ShapeItem {

    Figure figure; // Usamos la clase Figure
    private int x;
    private int y;

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ShapeItem() {
        figure = new Figure();
    }

    public void paint(Graphics g, RectangularShape shape, Color c) {
        int height = 100; // Mover height y width aquí como campos locales
        int width = 100;
        shape.setFrame(x, y, width, height);

        Graphics2D g2 = (Graphics2D) g.create();
        g2.setColor(c);
        g2.fill(shape);
        g2.dispose();
    }

    public boolean isInside(RectangularShape shape, MouseEvent e) {
        return shape.contains(e.getPoint());
    }

    public RectangularShape getShape1() {
        return figure.getShape1();
    }

    public RectangularShape getShape2() {
        return figure.getShape2();
    }

    public RectangularShape getRandomShape() {
        return Math.random() > 0.5 ? getShape1() : getShape2();
    }
}
