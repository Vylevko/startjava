import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Insert first value");
		if (s.hasNextInt()) {
			int a = s.nextInt();
			System.out.println("Insert action value(+, -, *, /, ^, %)");
			String action = s.next();
			System.out.println("Insert second value");
			if (s.hasNextInt()) {
				int b = s.nextInt();
				int result = 1;
				switch (action) {
				case "+": result = a + b;
				break;
				case "-": result = a - b;
				break;
				case "*": result = a * b;
				break;
				case "/": result = a / b;
				break;
				case "%": result = a % b;
				break;
				case "^":
					for (int i=0; i < b; i++) {
						result *= a;
					}
				break;
				default: System.out.println(action + " Invalid action");
				break;
				}
				System.out.println(a + " " + action + " " + b + " = " + result );
			} else {
				System.out.println("Second value is out of the range, please retry");
			}
				
		} else {
			System.out.println("Firs value is out of the range, please retry");
		}
		s.close();
	}
}