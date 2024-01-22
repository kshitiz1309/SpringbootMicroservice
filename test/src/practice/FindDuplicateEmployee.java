package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee(1,"kshitiz");
        Employee emp2 = new Employee(2,"baba");
        Employee emp3 = new Employee(3,"py");
        Employee emp4 = new Employee(4,"py");
        Employee emp5 = new Employee(5,"neta");
        Employee emp6 = new Employee(6,"kshitiz");

        List<Employee> list = new ArrayList<>();
        list.add(emp);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        list.add(emp6);

        //List<String> list2 = list.stream().map(employee-> employee.getEmpname()).distinct().collect(Collectors.toList());
        Map<String,Long> map = list.stream()
                .collect(Collectors.groupingBy(Employee::getEmpname ,Collectors.counting()))
                .entrySet().stream()
                .filter(entry-> entry.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
       /* for (String emplo : list2){
            System.out.println(emplo);
        }*/
        System.out.println("Duplicate Employee : "+map.keySet());
    }
}

class Employee{
    private int empid;

    public String getEmpname() {
        return empname;
    }

    private String empname;

    public Employee(int empid, String empname) {
        this.empid = empid;
        this.empname = empname;
    }
}
