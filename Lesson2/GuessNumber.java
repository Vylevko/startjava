import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int generatedNumber;
    private Player player1;
    private Player player2;
    Random random = new Random();
    Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        generatedNumber = random.nextInt(100) + 1;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        System.out.println("Computer generated valie from the range (0,100]");
        do { 
            System.out.println(player1.getName() + ", Your turn, insert value from the range (0,100]");
            if (scan.hasNextInt()) {
                player1.setNumber(scan.nextInt());
                scan.nextLine();
            } else {
                player1.setNumber(0);
                scan.nextLine();
            }
            
            if (guessNumber(player1.getNumber())) {
                System.out.println(player1.getName() + " Won!!!! GZ");
                break;
            }   
            System.out.println(player2.getName() + ", Your turn, insert value from the range (0,100]");
            if (scan.hasNextInt()) {
                player2.setNumber(scan.nextInt());
                scan.nextLine();
            } else {
                player1.setNumber(0);
                scan.nextLine();
            }
            
            if (guessNumber(player2.getNumber())) {
                System.out.println(player2.getName() + " Won!!!! GZ");
                break;
            }
            //System.out.println(generatedNumber);
        } while (true);
        
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