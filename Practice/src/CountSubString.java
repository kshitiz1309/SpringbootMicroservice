import java.util.*;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class CountSubString {
    public static void main(String[] args) {
        String str = "Hello World, Hello Welcome to EPAM";
        String[] str2 = str.split(" ");
        int count = 1;
        Map<String, Integer> hashmap = new HashMap<String, Integer>();
        System.out.println("start");
        for (String str3 : str2) {
            if (hashmap.containsKey(str3)) {
                hashmap.put(str3, hashmap.get(str3) + 1);
            } else {
                hashmap.put(str3, 1);
            }
        }
        /** normal order*/
        //Map<String, Integer> sorted = hashmap.entrySet().stream().sorted(comparingByValue()).collect(toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)-> e2,LinkedHashMap::new));
        /** reverse order*/
        Map<String, Integer> sorted = hashmap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)-> e2,LinkedHashMap::new));
        for (Map.Entry<String, Integer> entry : sorted.entrySet()){
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }
    }
}