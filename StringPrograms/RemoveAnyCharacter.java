package StringPrograms;

public class RemoveAnyCharacter {
	
	public static void main(String[] args) {
		String s="quescol";
		String c="e";
		System.out.println(removeChar(s,c));
	}
	
	public static String removeChar(String s,String c) {
		return s.replace(c, "");
	}

}
