import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        char continueGame;
        do {
            System.out.println("Insert first player's name");
            Player player1 = new Player(scan.next());
            System.out.println("Insert second player's name");
            Player player2 = new Player(scan.next());
            System.out.println("First player " + player1.getPlayerName());
            System.out.println("Second player " + player2.getPlayerName());
            GuessNumber game = new GuessNumber();
            boolean gameFinished = false;
            int count = 1;
            String playerName;
            String invalidNumber;
            do { 
                if (count % 2 == 1) {
                    playerName = player1.getPlayerName();
                } else {
                    playerName = player2.getPlayerName();
                }
                System.out.println("Round " + count + "! " + playerName + ", Your turn to guess");
                if (scan.hasNextInt()) {
                    gameFinished = game.numberGuessed(scan.nextInt());
                } else {
                    invalidNumber = scan.next();
                    System.out.println(playerName + " Failed to insert valid number");
                }   
                count++;
            } while (!gameFinished);
            System.out.println(playerName + ", Your Won!!!! GZ");
            do {
                System.out.println("Do You want to continue this game? Y/N");
                continueGame = scan.next().charAt(0);
            } while (!(continueGame == 'Y' || continueGame == 'N') );
        
        } while (continueGame == 'Y');
        scan.close();
    }
}
