public class ConditionalStatement {
	public static void main(String[] args) {
		byte age = 33;
		if (age > 30) {
			System.out.println("Not a Kid already");	
		}
		
		boolean isMale = true;
		if (isMale) {
			System.out.println("Guy");
		}
		
		if (!isMale) {
			System.out.println("Maybe a girl?");
		}
		
		float hght = 1.83f;
		if (hght < 1.80) {
			System.out.println("Shorter than average");
		}
		else {
			System.out.println("Average or higher");	
		}
		
		char firstNameLetter = 'M';
		if (firstNameLetter == 'M') {
			System.out.println("Mihkail?");
		} else if (firstNameLetter == 'I') {
			System.out.println("Irina?");
		} 
		else {
			System.out.println("Other name");
		}
	}
}