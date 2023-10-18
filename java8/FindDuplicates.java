package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {
	public static void main(String[] args) {
//		Set<Integer> set=new HashSet<>();
//		Arrays.asList(1,2,2,1,3,4,3,5)
//		.stream()
//		.filter(f->!set.add(f))
//		.forEach(System.out::println);
		
		
		
		
	//if number repeats more than 2 times use this approach
		Arrays.asList(1,2,2,1,3,4,3,5,2,3)
			.stream()
			.collect(Collectors.groupingBy(i->i,Collectors.counting()))
			.entrySet()
			.stream()
			.filter(f->f.getValue()>1)
			.map(m->m.getKey())
			.forEach(System.out::println);
		
	}

}
