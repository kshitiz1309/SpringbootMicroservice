package practice;

import java.util.*;

public class FindSecondHighestInAList {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        List<Integer> sortedList = myList.stream().sorted(Comparator.reverseOrder()).toList();
        int secondHighest = myList.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().orElse(0);
        System.out.println("Sorted List : "+ sortedList);
        System.out.println("Second Highest Number : "+ secondHighest);
    }
}
