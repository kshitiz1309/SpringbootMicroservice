package practice;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurrenceSubstring {
    public static void main(String[] args) {
        String input = "abcaaabbcbcacccdaddddddd";
        findMaxOccurrenceSubstring(input);
    }

    private static void findMaxOccurrenceSubstring(String input) {
        Map<Character, String> maxSubstringMap = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int count = 1;

            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(j) == currentChar) {
                    count++;
                } else {
                    break;
                }
            }

            String currentSubstring = maxSubstringMap.getOrDefault(currentChar, "");
            if (count > currentSubstring.length()) {
                maxSubstringMap.put(currentChar, input.substring(i, i + count));
            }

            i += count - 1;
        }

        System.out.println("Max occurrence substrings:");
        for (Map.Entry<Character, String> entry : maxSubstringMap.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue().length());
        }
    }
}
