package ArrayPrograms;

public class RemoveDuplicates {

	
	public static int duplicate(int[] a,int n) {
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(a[i]!=a[i+1]) {
				a[j++]=a[i];
			}
		}
		a[j++]=a[n-1]; //last element added in this
		return j;
	}
	public static void main(String[] args) {
		int[] a= {10,20,20,30,40,40,50};
		int n=duplicate(a,a.length);
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}
}
