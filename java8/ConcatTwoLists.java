package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatTwoLists {

	public static void main(String[] args) {

		List<String> list1=Arrays.asList("java"+" ","8"+" ");
		List<String> list2=Arrays.asList("explained"+" ","programs"+" ");
		
		Stream.concat(list1.stream(),list2.stream())
			.forEach(System.out::print);
	}

}
