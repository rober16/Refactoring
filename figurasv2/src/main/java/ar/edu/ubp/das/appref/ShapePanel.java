package ar.edu.ubp.das.appref;

import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

class ShapePanel extends JPanel {

    private static final long serialVersionUID = 1L;
    public static final double DEFAULT_SIZE = 100.0;
    public static final double SIZE_INCREMENT = 20.0;

    private List<Figure> figures;

    public ShapePanel() {
        this.figures = new ArrayList<>();
        figures.add(new Figure(new Rectangle2D.Double(50, 50, DEFAULT_SIZE, DEFAULT_SIZE), Color.RED, DEFAULT_SIZE));
        figures.add(new Figure(new Ellipse2D.Double(200, 50, DEFAULT_SIZE, DEFAULT_SIZE), Color.GREEN, DEFAULT_SIZE));
        figures.add(new Figure(new Rectangle2D.Double(350, 50, DEFAULT_SIZE, DEFAULT_SIZE), Color.BLUE, DEFAULT_SIZE));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                for (Figure figure : figures) {
                    if (figure.getShape().contains(e.getPoint())) {
                        figure.setSize(figure.getSize() + SIZE_INCREMENT);
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
        g2.dispose();
    }
}
