package java8;

import java.util.Arrays;

public class CountElements {
	public static void main(String[] args) {
		long count = Arrays.asList(1,2,3,4,5,6,7)
			.stream()
			.count();
		System.out.println(count);
			
	}
}
