import java.util.Random;

public class GuessNumber {
    private int generatedNumber;
    private boolean gameFinished;
    Random random = new Random();
    
    public GuessNumber() {
        generatedNumber = random.nextInt(100) + 1;
        gameFinished = false;
    }
    
    public boolean numberGuessed(int insertedNumber ) {
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
    
    public void startEndGame(Player player1, Player player2) {
        int count = 1;
        System.out.println("Computer generated valie from the range (0,100]");
        do { 
            if (count % 2 == 1) {
                System.out.println("Round " + count + "! " + player1.getPlayerName() + ", Your turn to guess");
                gameFinished = numberGuessed(player1.getNumber());
            } else {
                System.out.println("Round " + count + "! " + player2.getPlayerName() + ", Your turn to guess");
                gameFinished = numberGuessed(player2.getNumber());
            }
            //System.out.println(generatedNumber);
            count++;
        } while (!gameFinished);
        System.out.println("Your Won!!!! GZ");
    }
}