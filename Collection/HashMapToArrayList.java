package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapToArrayList {
	public static void main(String[] args) {
		HashMap<String,Integer> hashmap=new HashMap<>();
		hashmap.put("sachin", 1);
		hashmap.put("karan", 2);
		hashmap.put("kapil", 3);
		
		Set<String> keySet=hashmap.keySet();
		
		ArrayList<String> listOfKeys=new ArrayList<>(keySet);
		
		Collection<Integer> values = hashmap.values();
		
		ArrayList<Integer> listOfValues=new ArrayList<>(values);
		
		System.out.println(listOfKeys);
		System.out.println(listOfValues);
	}

}
