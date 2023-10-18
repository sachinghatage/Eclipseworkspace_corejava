package java8;

import java.util.Arrays;
import java.util.Comparator;

public class MaxElement {

	public static void main(String[] args) {

//		Integer integer = Arrays.asList(1,2,3,4,56,7,8)
//			.stream()
//			.max(Integer::compare)
//			.get();
//		
//		System.out.println(integer);
		
		
		//using comparator
		Integer integer = Arrays.asList(1,2,3,4,56,7,8)
			.stream()
			.max(Comparator.comparing(Integer::valueOf))
			.get();
		System.out.println(integer);
	}

}
