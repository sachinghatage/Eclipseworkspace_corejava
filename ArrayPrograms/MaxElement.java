package ArrayPrograms;

public class MaxElement {
	public static void main(String[] args) {
		int[] a= {1,12,3,4,5};
		max(a);
	}
	
	public static void max(int[] a) {
		int max=Integer.MIN_VALUE;
		for(int a1:a) {
			if(a1>max) {
				max=a1;
			}
			
		}
		System.out.println(max);
	}

}
