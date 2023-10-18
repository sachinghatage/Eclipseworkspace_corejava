package java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountElementFromString {

	public static void main(String[] args) {

		Map<String,Long> collect = Arrays.asList("AA","BB","AA","CC")
			.stream()
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
			
		System.out.println(collect);
	}

}
