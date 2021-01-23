import java.util.Random;

public class GuessNumber {
    private int generatedNumber;
    Random random = new Random();
    public GuessNumber() {
        generatedNumber = random.nextInt(100) + 1;
    }
    public boolean numberGuessed(int insertedNumber) {
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
}
