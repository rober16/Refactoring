package ar.edu.ubp.das.appref;

import javax.swing.*;
public class App {
    public App() {
        JFrame frame = new JFrame("Resize Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ShapePanel());
        frame.setLocationByPlatform(true);
        frame.setSize(500, 200);
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
