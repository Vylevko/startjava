import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int generatedNumber;
    private boolean gameFinished;
    private Player player1;
    private Player player2;
    Random random = new Random();
    Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        generatedNumber = random.nextInt(100) + 1;
        gameFinished = false;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        int count = 1;
        System.out.println("Computer generated valie from the range (0,100]");
        do { 
            if (count % 2 == 1) {
                System.out.println("Round " + count + "! " + player1.getName() + ", Your turn to guess");
            } else {
                System.out.println("Round " + count + "! " + player2.getName() + ", Your turn to guess");
            }
            if (scan.hasNextInt()) {
                gameFinished = numberGuessed(scan.nextInt());
                scan.nextLine();
            } else {
                System.out.println("Failed to insert valid value");
                scan.nextLine();
            }
            //System.out.println(generatedNumber);
            count++;
        } while (!gameFinished);
        System.out.println("Your Won!!!! GZ");
    }

    private boolean numberGuessed(int insertedNumber ) {
        if (!(insertedNumber > 0 && insertedNumber <= 100)) {
            System.out.println("Inserted value is out the range (0,100]");
            return false;
        } else if (insertedNumber > generatedNumber) {
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
}