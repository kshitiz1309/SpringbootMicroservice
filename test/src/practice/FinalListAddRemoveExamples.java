package practice;

import java.util.ArrayList;
import java.util.List;

public class FinalListAddRemoveExamples {
    public static void main(String[] args) {
        final List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(2);
        list.forEach(System.out::print);
    }
}
