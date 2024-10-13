package ar.edu.ubp.das.appref;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.RectangularShape;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class App extends Canvas implements MouseMotionListener {

    ShapeItem shape;
    boolean isMoving = false;
    PreviousPosition posicionPrevia;  // Usamos la clase PosicionPrevia

    public App() {
        shape = new ShapeItem();
        posicionPrevia = new PreviousPosition(0, 0); // Inicializamos la posición previa
        addMouseMotionListener(this);

        JFrame frame = new JFrame("Arrastra la figura");
        frame.getContentPane().add(this);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500, 500);
    }

    @Override
    public void paint(Graphics g) {
        // Mover 'random' y 'c' aquí, eliminando la necesidad de mantenerlos como atributos de la clase
        Random random = new Random();
        Color c = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

        // Eliminar código duplicado
        RectangularShape rs = random.nextInt(256) % 2 == 0 ? shape.getShape1() : shape.getShape2();
        shape.paint(g, rs, c);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (!isMoving) {
            RectangularShape rs = shape.getRandomShape(); // Centraliza la lógica para obtener la forma
            if (shape.isInside(rs, e)) {
                posicionPrevia.setPrevX(e.getX());
                posicionPrevia.setPrevY(e.getY());
                isMoving = true;
            }
        } else {
            shape.setX((shape.getX() + e.getX()) - posicionPrevia.getPrevX());
            shape.setY((shape.getY() + e.getY()) - posicionPrevia.getPrevY());

            posicionPrevia.setPrevX(e.getX());
            posicionPrevia.setPrevY(e.getY());

            repaint();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        isMoving = false;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new App());
    }
}