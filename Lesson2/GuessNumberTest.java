import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String continueGame;

        do {
            System.out.println("Insert first player's name");
            Player player1 = new Player(scan.next());
            System.out.println("Insert second player's name");
            Player player2 = new Player(scan.next());
            System.out.println("First player " + player1.getPlayerName());
            System.out.println("Second player " + player2.getPlayerName());
            GuessNumber game = new GuessNumber();
            game.startEndGame(player1.getPlayerName(), player2.getPlayerName());
            do {
                System.out.println("Do You want to continue this game? Y/N");
                continueGame = scan.next();
            } while (!("Y".equals(continueGame) || "N".equals(continueGame)) );
        } while ("Y".equals(continueGame));
        scan.close();
    }
}
