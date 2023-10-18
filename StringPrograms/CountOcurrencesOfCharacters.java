package StringPrograms;

public class CountOcurrencesOfCharacters {
	public static void main(String[] args) {
		String s="missisipi";
		char c='i';
		System.out.println(countOcurrence(s,c));
	}
	
	public static int countOcurrence(String s,char c) {
		char[] ch=new char[s.length()];
		int count=0;
		for(int i=0;i<s.length();i++) {
			 ch[i]=s.charAt(i);
			if(ch[i]==c) {
				count++;
			}
		}
		
		return count;
	}

}
