package StringPrograms;

public class EqualStringDivision {
	public static void main(String[] args) {
		String s="aaaabbbbcccc";
		int length = s.length();
		int n=3;
		int temp=0,chars=length/n;
		String[] equalString=new String[n];
		if(length%n!=0) {
			System.out.println("String cannot be divided in equal parts");	
		}else {
			for(int i=0;i<length;i=i+chars) {
				String substring = s.substring(i, i+chars);
				equalString[temp]=substring;
				temp++;
			}
		}
		
		for(int i=0;i<equalString.length;i++) {
			System.out.println(equalString[i]);
		}
	}

}
