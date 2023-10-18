package java8;

import java.util.Arrays;

public class CubeOnElements {
//Java 8 program to perform cube on list elements and filter numbers greater than 50

	public static void main(String[] args) {

		Arrays.asList(4,5,6,7,1,2,3)
			.stream()
			.map(i->i*i*i)
			.filter(i->i>50)
			.forEach(System.out::println);
		
	}

}
