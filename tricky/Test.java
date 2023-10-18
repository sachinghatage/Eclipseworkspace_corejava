package tricky;

public class Test {

	static int i=17;
	static int m1(int i) {
	return	i=i+10;
	}
	
	public static void main(String[] args) {

		int i=10;
		System.out.println(i);
		int m1 = m1(i);
		System.out.println(i);
		System.out.println(m1);
	}

}
