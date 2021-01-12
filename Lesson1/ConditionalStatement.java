public class ConditionalStatement {
	public static void main(String[] args) {
		byte age = 33;
		boolean isMale = true;
		float hght = 1.83f;
		char name1stletter = 'M' ;
		
		if (age > 30) {
			System.out.println ("Not a Kid already");	
		}
		if (isMale) {
			System.out.println ("Guy");
		}
		if (!isMale) {
			System.out.println ("Maybe a girl?");
		}
		if (hght < 1.80) {
			System.out.println ("Shorter than average");
		}
		else {
			System.out.println ("Average or higher");	
		}
		if (name1stletter == 'M') {
			System.out.println ("Mihkail?");
		}
		else if (name1stletter == 'I') {
			System.out.println ("Irina?");
		}
		else {
			System.out.println ("Other name");
		}
	}
}
