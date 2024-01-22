package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConcatenateListsUsingStream {
    public static void main(String[] args) {
        // Create the first list
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("orange");

        // Create the second list
        List<String> list2 = new ArrayList<>();
        list2.add("grape");
        list2.add("kiwi");
        list2.add("melon");

        // Concatenate the two lists using streams
        List<String> concatenatedList = Stream.concat(list1.stream(), list2.stream()).toList();

        // Print the concatenated list
        System.out.println("Concatenated list: " + concatenatedList);
        int[] i = {1,3,5,7};
        int[] j = {2,4,6,8};
        List<Integer>  concatenatedArray = IntStream.concat(Arrays.stream(i),Arrays.stream(j)).sorted().boxed().toList();
        System.out.println("Concatenated Integers list: " + concatenatedArray);
    }
}