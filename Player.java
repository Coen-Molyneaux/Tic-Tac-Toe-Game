import java.util.Scanner;

public class Player {
    static String player1;
    static String player2;
    static int round = 1;


    public static void getPlayerName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Player 1 name (*): ");
        player1 = scanner.nextLine();
        System.out.print("Player 2 name (o): ");
        player2 = scanner.nextLine();
    }

    public static String nextPlayer(){
        if (round % 2 == 0) {
            round++;
            return "player2";
        }
        else {
            round++;
            return "player1";
        }
    }

    public static void winnerMessage()
    {
        if (round % 2 == 0 && round < 9)
            System.out.println(player1.toUpperCase() + " WINS!");
        else if (round % 2 != 0 && round < 9)
            System.out.println(player2.toUpperCase() + " WINS!");
        else
            System.out.println("Stale mate");
    }
}
