package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

public class Question11 {

	public static void main(String[] args) {

		List<Integer> collect = Arrays.asList(1,2,3,4)
			.stream()
			.collect(Collectors.toList());
		
		Set<Integer> set=new HashSet<>(collect);
		if(collect.size()==set.size())
			System.out.println("false");
		else
			System.out.println("true");
		
		
	}

}
