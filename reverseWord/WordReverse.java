package reverseWord;

public class WordReverse {
    public static void main(String[] args) {
        String s="welcome to java";
        String[] split=s.split(" ");
        for(int i=split.length-1;i>=0;i--){
            System.out.print(split[i]+" ");
        }
    }
}
