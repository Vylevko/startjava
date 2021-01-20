import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        boolean toContinue = false;
        boolean reAsk;
        do {
            System.out.println("Insert first value");
            if (scan.hasNextInt()) {
                int a = scan.nextInt();
                System.out.println("Insert action value(+, -, *, /, ^, %)");
                char action = scan.next().charAt(0);
                System.out.println("Insert second value");
                if (scan.hasNextInt()) {
                    int b = scan.nextInt();
                    int result = calc.executeCalculation(a, b, action);
                    if (calc.getIncorrectAction()) {
                        System.out.println("Action is incorrect");
                    } else {
                        System.out.println(a + " " + action + " " + b + " = " + result );
                    }
                } else {
                    String errorValue = scan.next();
                    System.out.println("[" + errorValue + "] Your Second value is out of the range");
                }
            } else {
                String errorValue = scan.next();
                System.out.println("[" + errorValue + "] Your First value is out of the range");
            }
             
            do {

                System.out.println("Do You want to continue Y/N ");
                reAsk = false;
                String choise = scan.next();
                if (choise.equals("Y")) {
                    toContinue = true; 
                } else if (choise.equals("N")) {
                    toContinue = false;
                } else {
                    reAsk =true;
                }
                if (reAsk) {
                    System.out.println("Your choise is Invalid " + choise);
                } else {
                    System.out.println("Your choise is " + choise); 
                }
            } while (reAsk);
        } while (toContinue);
        System.out.println("End");
        scan.close();
    }
}