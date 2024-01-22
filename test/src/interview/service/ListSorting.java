package interview.service;


import interview.model.Employee2;

import java.util.Comparator;
import java.util.List;

public class ListSorting {
    public static void main(String[] args) {
        List<Employee2> list = List.of(new Employee2(1,"Madhu",32323),
                new Employee2(1,"Sam",93434),
                new Employee2(1,"Ashish",32323),
                new Employee2(1,"Lalu",32323),
                new Employee2(1,"Anandh",32323));

        List<Employee2> sortedList = list.stream().sorted(Comparator.comparing((Employee2::getEmpName), Comparator.reverseOrder())).toList();
        System.out.println(sortedList);
    }
}
