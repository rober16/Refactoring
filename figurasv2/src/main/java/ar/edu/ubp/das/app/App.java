package ar.edu.ubp.das.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;

public class App {

    public static final double DEFAULT_SIZE = 100.0;
    public static final double SIZE_INCREMENT = 20.0;

    Shape shape1;
    double size1;
    Shape shape2;
    double size2;
    Shape shape3;
    double size3;

    Random random = new Random();

    public App() {
        size1 = DEFAULT_SIZE;
        size2 = DEFAULT_SIZE;
        size3 = DEFAULT_SIZE;

        shape1 = new Rectangle2D.Double(50, 50, size1, size1);
        shape2 = new Ellipse2D.Double(200, 50, size2, size2);
        shape3 = new Rectangle2D.Double(350, 50, size3, size3);

        JFrame frame = new JFrame("Resize Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ShapePanel());
        frame.setLocationByPlatform(true);
        frame.setSize(500, 200);
        frame.setVisible(true);
    }

    class ShapePanel extends JPanel {

        private static final long serialVersionUID = 1L;

        public ShapePanel() {
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (shape1.contains(e.getPoint())) {
                        size1 += SIZE_INCREMENT;
                        shape1 = new Rectangle2D.Double(50, 50, size1, size1);
                    } else if (shape2.contains(e.getPoint())) {
                        size2 += SIZE_INCREMENT;
                        shape2 = new Ellipse2D.Double(200, 50, size2, size2);
                    } else if (shape3.contains(e.getPoint())) {
                        size3 += SIZE_INCREMENT;
                        shape3 = new Rectangle2D.Double(350, 50, size3, size3);
                    }
                    repaint();
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setColor(Color.RED);
            g2.fill(shape1);
            g2.setColor(Color.GREEN);
            g2.fill(shape2);
            g2.setColor(Color.BLUE);
            g2.fill(shape3);
            g2.dispose();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new App();
            }
        });
    }
}
