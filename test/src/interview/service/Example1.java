package interview.service;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example1 {

    public static void main(String[] args) {
        /*int[] i = {11,2,4,5,1,4,2,5,7};

        Map<Integer,Long> map = Arrays.stream(i).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        map.forEach((k,v)-> System.out.println(k+" : "+v));*/
        List<String> dryFruits = new ArrayList<>();
        dryFruits.add("Walnut");
        dryFruits.add("Apricot");
        dryFruits.add("Almond");
        dryFruits.add("Date");

        Iterator<String> iterator = dryFruits.iterator();
        while(iterator.hasNext()) {
            String dryFruit = iterator.next();
            if(dryFruit.startsWith("A")) {
                dryFruits.remove(dryFruit);
            }
        }

        System.out.println(dryFruits);

    }



}
