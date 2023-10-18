package StringPrograms;

public class EvenLengthString {

	public static void main(String[] args) {

		String s="I am going to learn java";
		evenLength(s);
	}
	
	public static void evenLength(String s) {
		String[] words = s.split(" ");
		for(String word:words) {
			if(word.length()%2==0) {
				System.out.println(word);
			}
		}
		
	}

}
