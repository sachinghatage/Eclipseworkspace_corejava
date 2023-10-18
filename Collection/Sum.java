package Collection;

import java.util.Arrays;
import java.util.List;

public class Sum {

	

	public static void main(String[] args) {

		List<List<Integer>> integers=Arrays.asList(
				Arrays.asList(1,2,3),
				Arrays.asList(4,5,6),
				Arrays.asList(7,8,9));
		
		System.out.println(integers.stream().flatMapToInt(list->list.stream().mapToInt(Integer::intValue)).sum());
	}

}
