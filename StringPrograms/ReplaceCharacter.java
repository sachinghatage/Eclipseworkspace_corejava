package StringPrograms;

public class ReplaceCharacter {

	public static void main(String[] args) {

		String s="geeks gor geeks";
		char c='f';
		int index=6;
		replace(s,c,index);
	}
	
	public static void replace(String s,char c,int index) {
		String s1=s.substring(0, index)+c+s.substring(index+1);
		System.out.println(s1);
	}

}
