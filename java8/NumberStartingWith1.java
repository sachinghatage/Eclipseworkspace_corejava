package java8;

import java.util.Arrays;

public class NumberStartingWith1 {

	public static void main(String[] args) {

		Arrays.asList("11","12","13","43","19","6","54","43")
			.stream()
			//.map(m->m + "")   this line is needed if objects are not taken in string format.
			.filter(f->f.startsWith("1"))
			.forEach(System.out::println);
	}

}
