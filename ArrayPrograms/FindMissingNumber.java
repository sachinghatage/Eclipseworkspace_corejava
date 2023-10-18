package ArrayPrograms;

public class FindMissingNumber {
	public static void main(String[] args) {
		int[] a= {4,3,8,7,5,2,6};
		System.out.println(findMissing(a));
	}
	
	public static int findMissing(int[] a) {
		int n=a.length+1;
		int sum=n*(n+1)/2;
		int originalSum=0;
		for(int i=0;i<a.length;i++) {
			originalSum+=a[i];
		}
		
		return sum-originalSum;
	}

}
