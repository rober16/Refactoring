package ar.edu.ubp.das.app;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class App {

    public static final Color DEFAULT_COLOR = Color.BLUE;

    Random random = new Random();

    Shape shape1;
    Color color1;
    Shape shape2;
    Color color2;
    Shape shape3;
    Color color3;
    Shape shape4;
    Color color4;

    public App() {
        shape1 = new Rectangle2D.Double(110, 1, 100, 100);
        color1 = DEFAULT_COLOR;

        shape2 = new Rectangle2D.Double(1, 110, 100, 100);
        color2 = DEFAULT_COLOR;

        shape3 = new Ellipse2D.Double(1, 1, 100, 100);
        color3 = DEFAULT_COLOR;

        shape4 = new Ellipse2D.Double(110, 110, 100, 100);
        color4 = DEFAULT_COLOR;

        ShapesPanel panel = new ShapesPanel();

        JFrame frame = new JFrame("Figuras");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setLocationByPlatform(true);
        frame.pack();
        frame.setVisible(true);
    }

    class ShapesPanel extends JPanel {

        private static final long serialVersionUID = -5780799542369779713L;

        public ShapesPanel() {
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    Color color = getColor();
                    if (shape1.contains(e.getPoint())) {
                        color1 = color;
                    }
                    else if (shape2.contains(e.getPoint())) {
                        color2 = color;
                    }
                    else if (shape3.contains(e.getPoint())) {
                        color3 = color;
                    }
                    else if (shape4.contains(e.getPoint())) {
                        color4 = color;
                    }
                    repaint();
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2 = (Graphics2D) g.create();
            g2.setColor(color1);
            g2.fill(shape1);
            g2.setColor(color2);
            g2.fill(shape2);
            g2.setColor(color3);
            g2.fill(shape3);
            g2.setColor(color4);
            g2.fill(shape4);
            g2.dispose();
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(212, 212);
        }

        private Color getColor() {
            return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
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

