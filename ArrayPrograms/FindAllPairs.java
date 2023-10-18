package ArrayPrograms;

public class FindAllPairs {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		int target=8;
		findPair(a,target);
	}
	
	public static void findPair(int[] a,int target) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==target) {
					System.out.println(a[i]+" , "+a[j]);
				}
			}
		}
	}

}
