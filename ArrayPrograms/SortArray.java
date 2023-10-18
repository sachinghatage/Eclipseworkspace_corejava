package ArrayPrograms;

public class SortArray {
	public static void main(String[] args) {
		int[] a= {1,5,7,2,5,9};
		sortArray(a);
	}
	
	public static void sortArray(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
