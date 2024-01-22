package practice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapSorting {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("David", 95);
        scores.put("Jane", 80);
        scores.put("Mary", 97);
        scores.put("Lisa", 78);
        scores.put("Dino", 65);
        System.out.println("Unsorted Map: " + scores);
        //scores.forEach((k,v)-> System.out.println(k+" : "+v));

        Map<String, Integer> sortedMap = scores.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(
                                LinkedHashMap::new,
                                (map, entry) -> map.put(entry.getKey(), entry.getValue()),
                                LinkedHashMap::putAll
                        );

                System.out.println("Sorted Map by scores (Ascending Order): " + sortedMap);

                // Sorting the map by values in descending order
                Map<String, Integer> reverseSortedMap = scores.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .collect(
                                LinkedHashMap::new,
                                (map, entry) -> map.put(entry.getKey(), entry.getValue()),
                                LinkedHashMap::putAll
                        );

                System.out.println("Sorted Map by scores (Descending Order): " + reverseSortedMap);


    }
}
