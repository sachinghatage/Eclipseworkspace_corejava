package java8;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeated {

	public static void main(String[] args) {
		
		
	//	When you want to collect elements without any transformation, you can use Function.identity() as the mapping function, which essentially means "keep the elements as they are.

String s="java articles are awesome";
Character character=s.chars()
			.mapToObj(m->Character.toLowerCase(Character.valueOf((char) m)))
			.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
			.entrySet()
			.stream()
			.filter(entry->entry.getValue()==1)
			.map(entry->entry.getKey())
			.findFirst()
			.get();

System.out.println(character);
	}

}
