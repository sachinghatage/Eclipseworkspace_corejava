package StringPrograms;

public class DigitOrNot {
	public static void main(String[] args) {
		char c='a';
		check(c);
	}
	
	public static void check(char c) {
		if(c>='1' && c<='9') {
			System.out.println("charcter is digit");
		}else {
			System.out.println("character is alphabet");
		}
	}

}
