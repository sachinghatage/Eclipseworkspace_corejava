package ArrayPrograms;

public class PalindromeNumber {
	
	public static void palindrome(int n) {
		int temp=n;
		int reverse=0;
		while(n!=0) {
			int remainder=n%10;
			reverse=reverse*10+remainder;
			n=n/10;
		}
		
		if(reverse==temp) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}
	
	
	public static void main(String[] args) {
		int n=343;
		palindrome(n);
	}

}
