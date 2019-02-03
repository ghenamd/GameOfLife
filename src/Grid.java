import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class Grid extends JPanel {

    private int buttonHeight = 10;
    private int buttonWidth = 10;

    public Grid() {
        Panel panel = createPanel();
        //For each empty space in the grid insert a button, allocate a new Cell
        // to each button and set the i to X(columns) and j to Y(rows) coordinates within a 2D Array
        for (int i = 0; i < Utils.rows; i++) {
            for (int j = 0; j < Utils.colms; j++) {
                // Create a new buttons
                GridButton button = createGridButtons();
                Utils.grid[i][j] = button;
                //Add button to the panel
                panel.add(button);
            }
        }
        add(panel);
    }

    private Panel createPanel() {
        //Get a new Panel for the JFrame
        Panel panel = new Panel();
        //Set a Gridlayout for the Panel to divide it in even rectangles
        panel.setLayout(new GridLayout(Utils.rows, Utils.colms));
        panel.setBounds(0, 0, getWidth() - 5, getHeight() - 5);
        return panel;
    }

    private GridButton createGridButtons() {
        GridButton button = new GridButton();
        button.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
       // buttonSetRandomColor(button);
         button.setBackground(Color.WHITE);
        return button;
    }
    //Helper method to set a random color to the buttons
    public void buttonSetRandomColor(GridButton button) {
        Random random = new Random();
        int state = random.nextInt(2);
        if (state == 1) {
            button.setBackground(Color.WHITE);
        } else if (state == 0) {
            button.setBackground(Color.BLACK);
        }
    }
}
