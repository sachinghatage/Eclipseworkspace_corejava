package ArrayPrograms;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfNumbers {

	public static void main(String[] args) {

		int[] numbers= {1,2,3,2,3,2,4,5,3,2,1};
		frequency(numbers);
	}
	
	public static void frequency(int[] numbers) {
		Map<Integer,Integer> map=new HashMap<>();
		for(Integer number:numbers) {
			if(map.containsKey(number)) {
				map.put(number, map.get(number)+1);
			}else {
				map.put(number, 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		
	}

}
