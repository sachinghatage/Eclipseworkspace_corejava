package ArrayPrograms;

public class PrimeNumber {
	public static void main(String[] args) {
		int n=11;
		boolean primeNumber = primeNumber(n);
		System.out.println(primeNumber);
	}
	
	public static boolean primeNumber(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
