package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateWordsInAString {
    public static void main(String[] args) {
        String  s = "my name name is is kshitiz kshitiz";

        String[] s1 = s.split(" ");
        Map<String,Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (String string : s1) {
            if (map.containsKey(string)) {
                list.add(string);
            } else {
                map.put(string, 1);
            }
        }
        System.out.println("duplicate Strings : " + list);
    }
}
