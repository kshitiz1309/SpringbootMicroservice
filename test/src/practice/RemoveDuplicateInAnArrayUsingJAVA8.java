package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class RemoveDuplicateInAnArrayUsingJAVA8 {
    public static void main(String[] args){
        int[] number = {1,3,2,4,5,6,7,8,9,4,3,1,6,5,9};
        List<Integer> nonDuplicate=Arrays.stream(number).boxed().distinct().sorted().toList();
        System.out.println("Non Duplicate List : "+nonDuplicate);

        //Arrays.stream(number).boxed().sorted((a, b)->b.compareTo(a)).forEach(System.out::println);
    }
}

