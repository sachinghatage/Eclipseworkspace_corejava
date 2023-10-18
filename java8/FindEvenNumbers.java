package java8;

import java.util.Arrays;

public class FindEvenNumbers {

	public static void main(String[] args) {

		Arrays.asList(1,2,3,4,5,6,7,8,9)
			.stream()
			.filter(n->n%2==0)
			.forEach(System.out::println);
	}

}
