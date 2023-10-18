package ArrayPrograms;

public class MinElement {
	public static void main(String[] args) {
		int[] a= {1,4,2,6,9};
		min(a);
	}
	
	public static void min(int[] a) {
		int min=Integer.MAX_VALUE;
		for(int a1:a) {
			if(a1<min) {
				min=a1;
			}
		}
		System.out.println(min);
	}

}
