import java.util.Scanner;

public class MyGame {
    public static void main(String[] args) {
        int number = 78;
        //System.out.println(number);
        Scanner scan = new Scanner(System.in);
        int myNumber = 0;
        System.out.println("Try to guess the number from 0 to 100");
        do {
            if (!scan.hasNextInt()) {
                System.out.println("Your variant is not a number, try from the very begining");
                break;
            }
            myNumber = scan.nextInt();
            if (myNumber > 100 || myNumber <= 0 ) {
                System.out.println("Your variant is out of the range (0,100], try again");
                continue;
            } 
            if (myNumber < number) {
                System.out.println("My number is greater, try again");
            } else if (myNumber > number) {
                System.out.println("My number is smaller, try again");
            } else {
                System.out.println("You guessed, my number was " + number);
            }
            
        } while (number != myNumber);
        scan.close();
    }
}
