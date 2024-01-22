package practice;

import java.util.HashMap;
import java.util.Map;

public class ShowDuplicateCharacter {
    public static void main(String[] args) {
        String s = "Hello world";
        char[] c = s.toCharArray();
        int count = 1;
        Map<Character,Integer> map = new HashMap<>();
        for(Character c1 :c){
            if(map.containsKey(c1)){
                map.put(c1,map.get(c1)+count);
            }else {
                map.put(c1, count);
            }
        }
        for(Map.Entry<Character,Integer> map2 : map.entrySet()){
            if(map2.getValue()>1) {
                System.out.println("Duplicate Character : " + map2.getKey() + " :: occurrence :" + map2.getValue());
            }
        }
    }
}
