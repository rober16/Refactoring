package ar.edu.ubp.das.appref;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.LinkedList;
import javax.swing.JPanel;
import java.util.Random;

class ShapesPanel extends JPanel {

    private static final long serialVersionUID = -5780799542369779713L;
    private LinkedList<Figure> figures;
    private Random random = new Random();

    public ShapesPanel() {
        this.figures = new LinkedList<Figure>();
        this.figures.add(new Figure(new Rectangle2D.Double(110, 1, 100, 100), Color.BLUE));
        this.figures.add(new Figure(new Rectangle2D.Double(1, 110, 100, 100), Color.BLUE));
        this.figures.add(new Figure(new Ellipse2D.Double(1, 1, 100, 100), Color.BLUE));
        this.figures.add(new Figure(new Ellipse2D.Double(110, 110, 100, 100), Color.BLUE));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                for (int i = 0; i < figures.size(); i++) {
                    if (figures.get(i).getShape().contains(e.getPoint())) {
                        figures.get(i).setColor(getColor());
                    }
                }
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g.create();
        for (int i = 0; i < figures.size(); i++) {
            g2.setColor(figures.get(i).getColor());
            g2.fill(figures.get(i).getShape());
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(212, 212);
    }

    private Color getColor() {
        return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }
}