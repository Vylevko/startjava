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
        System.out.println("Computer generated valie from the range (0,100]");
        do { 
            System.out.println("Insert value from the range (0,100]");
            if (scan.hasNextInt()) {
                gameFinished = guessNumber(scan.nextInt());
                scan.nextLine();
            } else {
                System.out.println("Failed to insert valid value");
                scan.nextLine();
            }
            //System.out.println(generatedNumber);
        } while (!gameFinished);
        System.out.println("Your Won!!!! GZ");
    }

    private boolean guessNumber(int Number) {
        if (!(Number > 0 && Number <= 100)) {
            System.out.println("Inserted value is out the range (0,100]");
        } else if (Number > generatedNumber) {
            System.out.println("Generated number is less than yourth");
        } else if (Number < generatedNumber) {
            System.out.println("Generated number is greater than yourth");
        } else {
            System.out.println("Correct");
            return true;
        }
    return false;
    }
}