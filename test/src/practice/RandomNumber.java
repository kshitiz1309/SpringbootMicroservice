package practice;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class RandomNumber {
    public static void main(String[] args){
        List<Integer> numbers =  new Random()
                .ints(0,1000)
                .limit(10).boxed().toList();

        System.out.println("10 Random Numbers : "+numbers);

        List<Integer> range = IntStream.range(1, 11).boxed().toList(); // print 1 to 10 numbers
        System.out.println("Number from 1 to 10 : "+range);
    }
}
