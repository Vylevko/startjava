import java.util.Scanner;
import java.util.Date;
public class MyGame {
	public static void main(String[] args) {
		Date date = new Date();
		int number = (int)((date.getTime() ^ 2) * 17)%101;
		//System.out.println(number);
		Scanner s = new Scanner(System.in);
		int myNumber = 0;
		System.out.println("Try to guess the number from 0 to 100");
		do {
			if (!s.hasNextInt()) {
				System.out.println("Your variant is not a number, try from the very begining");
				break;
			}
			myNumber = s.nextInt();
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
		s.close();
	}
}
