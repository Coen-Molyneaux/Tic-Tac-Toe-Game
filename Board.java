public class Board {
    private final int rows;
    private final int cols;
    public static char[][] grid = new char[3][3];
    char value = '1';

    // Parameterized constructor
    public Board() {
        this.rows = 3;
        this.cols = 3;
        }

    public void initializeGrid() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = value;
                value++;
            }
        }
    }

    // Method to print the grid
    public void printGrid() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(grid[i][j]);
                if (j < cols - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < rows - 1) {
                System.out.println("---------");
            }
        }
    }

    public char[][] getGrid(){
        return grid;
    }


}
