import java.util.Scanner;

public class Move {
    private int playerMove;
    private static char[][] grid;

    public void promptPlayer(String player) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();

        System.out.print("Select a tile: ");
        playerMove = scanner.nextInt();

        System.out.println(" ");
        storeMove(playerMove, player);
    }

    private void storeMove(int playerMove, String player) {
        Board board = new Board();
        grid = board.getGrid();

        char moveChar = (char) (playerMove + '0');
        char symbol = player.equals("player1") ? '*' : 'o';

            // Iterate through the grid to find and replace the character
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == moveChar) {
                        grid[i][j] = symbol;
                        break; // Exit once the move is made
                    }
                }
            }
    }

    public boolean checkWin(char[][] grid) {
        return !checkColumn(grid) && !checkDiagonals(grid) && !checkRows(grid);
    }

    private boolean checkColumn(char[][] grid){
        for (int j = 0; j < grid[0].length; j++) {
            if (grid[0][j] == grid[1][j] && grid[1][j] == grid[2][j] && grid[0][j] != '\0') {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonals(char[][] grid){
        if (grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2] && grid[0][0] != '\0') {
            return true;
        } else
            return grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0] && grid[0][2] != '\0';
    }

    private boolean checkRows(char[][] grid){
        for (char[] chars : grid) {
            if (chars[0] == chars[1] && chars[1] == chars[2] && chars[0] != '\0') {
                return true;
            }
        }
        return false;
    }

}
