package practice;

import java.util.stream.Stream;

public class FindAnyJava8 {
    public static void main(String[] arg) {
        Stream<String> stream = Stream.of("A","B","C","D");
        stream.peek(System.out::println).findAny().orElseThrow(()->new IllegalArgumentException("NA"));
    }
}


