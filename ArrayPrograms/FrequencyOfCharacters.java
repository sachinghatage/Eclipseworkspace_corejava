package ArrayPrograms;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {

	public static void main(String[] args) {
		String[] words= {"sachin","rohan","ajit","rushi","sachin"};
		frequency(words);
	}
	
	public static void frequency(String[] words) {
		Map<String,Integer> map=new HashMap<>();
		for(String word:words) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}else {
				map.put(word, 1);
			}
		}
		
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey() + " - " +entry.getValue());
		}
	}
	
	

}
