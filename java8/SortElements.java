package java8;

import java.util.Arrays;
import java.util.Collections;

public class SortElements {

	public static void main(String[] args) {

		Arrays.asList(13,24,32,45,34,23)
			.stream()
		//	.sorted()  //by default ascending order
			.sorted(Collections.reverseOrder()) //descending
			.forEach(System.out::println);
	}

}
