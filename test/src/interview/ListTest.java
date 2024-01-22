package interview;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListTest {
    public static void main(String[] args) {
        List<String> array = List.of("Java","Python","Python");

        Map<String,Long> map = array.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

                map.forEach((k,v)-> System.out.println(k+" : "+v));
    }
}
