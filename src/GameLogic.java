import java.awt.*;

public class GameLogic {
    private Color alive = Color.BLACK;
    private Color dead = Color.WHITE;
    private GridButton[][] grid;

    public GameLogic(GridButton[][] grid) {
        this.grid = grid;
    }

    public void changeGridState() {
        for (int i = 1; i < Utils.rows - 1; i++) {
            for (int j = 1; j < Utils.colms - 1; j++) {
                Color stateColor = grid[i][j].getBackground();
                int neighbours = countNeighbours(grid, i, j);

                if (stateColor == alive && (neighbours < 2 || neighbours > 3)) {
                    grid[i][j].setBackground(dead);
                }
                if (stateColor == alive &&( neighbours == 3 || neighbours == 2)) {
                    grid[i][j].setBackground(alive);
                }
                if (stateColor == dead && neighbours == 3) {
                    grid[i][j].setBackground(alive);
                }

            }
        }
    }

    private int countNeighbours(GridButton[][] grid, int x, int y) {
        int sum = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (grid[x + i][y + j].getBackground() == alive) {
                    sum += 1;
                }
            }
        }
        return sum - 1;
    }
}
