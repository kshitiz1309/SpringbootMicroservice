package practice;

import java.util.Arrays;
import java.util.Comparator;

public class MaxIntegerUsingJava8 {
    public static void main(String[] args) {
        int[] i = {2,4,3,1,6,3,8,9,10};
        int max = Arrays.stream(i).max().orElseThrow(()-> new IllegalArgumentException("unable to find highest number"));
        System.out.println("Highest number is : "+max);

        int secondMax = Arrays.stream(i).boxed()
                .distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst()
                .orElseThrow(()-> new IllegalArgumentException("unable to find second highest number"));
        System.out.println("second highest number is : "+secondMax);

    }
}
