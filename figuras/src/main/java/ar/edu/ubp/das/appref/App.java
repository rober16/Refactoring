package ar.edu.ubp.das.appref;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {

    public App() {
        JFrame frame = new JFrame("Figuras");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ShapesPanel());
        frame.setLocationByPlatform(true);
        frame.pack();
        frame.setVisible(true);
    }   

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new App();
            }
        });
    }

}

