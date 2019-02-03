

import javax.swing.*;
import java.awt.*;


public class Main {
     // Click on the grid to create a pattern an press Start button to start the game
    // Close(X) the grid to exit the game
    public static void main(String[] aStrings) {
        Panel start = new Panel();
        start.add(new StartButton());
        Grid grid = new Grid();
        JFrame life = new JFrame();
        life.setTitle(Utils.TITLE.toUpperCase());
        life.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        life.setSize(700, 600);
        life.setLayout(new BorderLayout());
        life.getContentPane().add(grid, BorderLayout.NORTH);
        life.getContentPane().add(start, BorderLayout.SOUTH);
        life.setLocation(500, 25);
        life.pack();
        life.setVisible(true);
    }
}
