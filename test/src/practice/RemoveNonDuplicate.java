package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveNonDuplicate {
    public static void main(String[] args) {
        int[] array = {1,3,2,4,5,6,7,8,9,4,3,1,6,5,9};

        List<Integer> nonDuplicate = Arrays.stream(array).boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue()==1)
                .map(Map.Entry::getKey)
                .toList();

        List<Integer> duplicate = Arrays.stream(array).boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue()>1)
                .flatMap(entry -> Arrays.stream(new Integer[entry.getValue().intValue()])
                        .map(i -> entry.getKey())).toList();

        System.out.println("Non Duplicate List : "+nonDuplicate);
        System.out.println("Duplicate List : " + duplicate);
    }
}
