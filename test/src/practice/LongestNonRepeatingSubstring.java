package practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestNonRepeatingSubstring {

    static String getUniqueCharacterSubstring(String input) {
        //coforgetest
        Map<Character, Integer> visited = new HashMap<>();
        String output = "";
        int start = 0;
        for (int end = 0; end < input.length(); end++) {//0,1,2,3,
            char currChar = input.charAt(end);
            if (visited.containsKey(currChar)) {
                start = Math.max(visited.get(currChar)+1, start);//0,1
               // System.out.println(start);
            }
            if (output.length() < end - start + 1) {
                //System.out.println(output);
                output = input.substring(start, end + 1);//cof
            }
            //System.out.println("currChar :"+currChar+" end :"+end);
            visited.put(currChar, end);
        }
        //visited.forEach(System.out::println);
        return output;
    }

    public static void main(String[] args) {
        String input = "coforgetest";
        String longestSubstring = getUniqueCharacterSubstring(input);
        System.out.println("Longest non-repeating substring in '" + input + "' is: " + longestSubstring);
    }
}
