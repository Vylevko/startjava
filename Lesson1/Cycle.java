public class Cycle {
	public static void main(String[] args) {
		System.out.println("For Cycle");
		for (int i = 0; i <= 20; i++) {
			System.out.println("number " + i);	
		}
		
		System.out.println("While Cycle");
		int a = 6;
		while (a >= -6) {
			System.out.println("number " + a);
			a -= 2;
		}
		
		System.out.println("DO While Cycle");
		int sum = 0;
		a = 10;
		do { 
			if (a % 2 == 1) {
				sum += a;
			}
			a++;
		} while (a <= 20);
		System.out.println("DO While Cycle result " + sum);
	}
}