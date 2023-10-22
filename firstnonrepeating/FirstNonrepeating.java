package firstnonrepeating;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonrepeating {
    public static void main(String[] args) {
        String s="aabbccdef";
        System.out.println(getFirstNonRepeated(s));
    }

    public static char getFirstNonRepeated(String s){
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.containsKey(c)?map.get(c)+1:1);
        }

        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        throw new RuntimeException("didnot find any");
    }
}
