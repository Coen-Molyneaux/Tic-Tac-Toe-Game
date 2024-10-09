import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int round = 1;

        Board board = new Board();
        Move move = new Move();

        Player.getPlayerName();
        board.initializeGrid();
        board.printGrid();


        while(move.checkWin(board.getGrid()) && round <= 9) {
            move.promptPlayer(Player.nextPlayer());
            board.printGrid();
            round++;
        }
        Player.winnerMessage();
    }



}



