package ArrayPrograms;

public class MagicNumber {
	public static void main(String[] args) {
		int n=163;
		magicNumber(n);
	}
	
	public static void magicNumber(int n) {
		int sum=0;
		while(n>0||sum>9) {
			if(n==0) {
				n=sum;
				sum=0;
			}
			sum+=n%10;
			n/=10;
		}
		
		if(sum==1) {
			System.out.println("magic number");
		}else {
			System.out.println("not magic number");
		}
	}

}
