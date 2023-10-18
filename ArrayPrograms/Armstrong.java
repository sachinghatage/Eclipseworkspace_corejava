package ArrayPrograms;

public class Armstrong {

	public static void armstrong(int n) {
		int n1=n;
		int t1=n;
		int length=0;
		while(t1!=0) {
			length++;
			t1=t1/10;
		}
		
		int sum=0;
		int t2=n;
		while(t2!=0) {
			int multiply=1;
			int remainder=t2%10;
			for(int i=1;i<=length;i++) {
				multiply*=remainder;
			}
			sum+=multiply;
			t2=t2/10;
		}
		if(sum==n1) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("not Armstrong number");
		}
	}
	
	public static void main(String[] args) {

		int n=1634;
		armstrong(n);
		
	}

}
