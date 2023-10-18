package StringPrograms;

public class LongestString {

	public static String longest(String s) {
		String longest="";
		String[] words = s.split(" ");
		for(String word:words) {
			if(word.length()>longest.length()) {
				longest=word;
			}
		}
		return longest;
	}
	
	public static void main(String[] args) {

		String s="i am learning java";
		System.out.println(longest(s));
	}

}
