package ArrayPrograms;

public class RightRotate {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int n=3;
		rotate(a,n);
	}
	
	public static void rotate(int[] a,int n) {
		
		for(int i=0;i<n;i++) {
			int last=a[a.length-1],j;
			for(j=a.length-1;j>0;j--) {
				a[j]=a[j-1];
			}
		a[0]=last;
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
