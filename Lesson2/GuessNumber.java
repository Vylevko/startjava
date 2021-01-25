import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int generatedNumber;
    private String playerName;
    private boolean gameFinished;
    Random random = new Random();
    Scanner scan = new Scanner(System.in);

    public GuessNumber() {
        generatedNumber = random.nextInt(100) + 1;
        gameFinished = false;
    }

    public boolean numberGuessed(int insertedNumber ) {
        if (insertedNumber > generatedNumber) {
            System.out.println("Generated number is less than yourth");
            return false;
        } else if (insertedNumber < generatedNumber) {
            System.out.println("Generated number is greater than yourth");
            return false;
        } else {
            System.out.println("Correct");
            return true;
        }
    }

    public void startEndGame(String player1, String player2) {
        int count = 1;
        System.out.println("Computer generated valie from the range (0,100]");
        do { 
            if (count % 2 == 1) {
                playerName = player1;
            } else {
                playerName = player2;
            }
            System.out.println("Round " + count + "! " + playerName + ", Your turn to guess");
            if (scan.hasNextInt()) {
                gameFinished = numberGuessed(scan.nextInt());
            } else {
                scan.nextLine();
            System.out.println(playerName + " Failed to insert valid number");
            }
            //System.out.println(generatedNumber);
            count++;
        } while (!gameFinished);
        System.out.println(playerName + ", Your Won!!!! GZ");
    }
}
