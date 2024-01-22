package practice;

import java.util.HashMap;
import java.util.Map;

public class NumberOfOccurrence {
    public static void main(String[] args){
        String s = "Kshitiz";
        Map<Character,Integer> map = new HashMap<>();
        int count = 1;
        for(int i = 0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+count);
            }else{
                map.put(s.charAt(i),count);
            }
        }
        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
