package interview.service;

import interview.model.Department;
import interview.model.Employee;
import interview.model.EmployeeMapper;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeService {
    public static void main(String[] args) {
        List<Employee> employeeList = List.of(
        new Employee("Kshitiz Srivastava",15000, Department.IT),
        new Employee("Amit Yadav",10000,Department.HR),
        new Employee("Anuj Chauhan",20000,Department.Accounting),
        new Employee("Atul Tiwari",17000,Department.IT),
        new Employee("Pankaj YADAV",18000,Department.HR),
        new Employee("Ankit Verma",25000,Department.Accounting));
        System.out.println("printing All Employee ==> ");
        printEmployee(employeeList); //printing All Employee
        System.out.println();
        System.out.println("Show First name and last name ==> ");
        showEmpName(employeeList); // Show First name and last name

        List<Employee> sortedEmployeeList = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalery,Comparator.naturalOrder()))
                .collect(Collectors.toList());
        List<Employee> sortedEmployeeListDescending = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalery, Comparator.reverseOrder()))
                .collect(Collectors.toList());
        System.out.println();
        System.out.println("Print Employee Ascending order of salary ==> ");
        printEmployee(sortedEmployeeList); // To Print Employee Ascending order of salary
        System.out.println();
        System.out.println("Print Employee Descending order of salary ==> ");
        printEmployee(sortedEmployeeListDescending); // To Print Employee Descending order of salary

        Map<Department,List<Employee>> groupingUsingJava8= employeeWithSameDepartmentUsingJava8(employeeList); // Get Employee with same department
        Map<Department,List<Employee>> groupingUsingTraditionalApproach= employeeWithSameDepartmentMap(employeeList);
        System.out.println();
        System.out.println("Grouping Employee using Java 8 ==> ");
        groupingUsingJava8.forEach((k,v)-> System.out.println(k +" : "+v));
        System.out.println();
        System.out.println("Grouping Employee using traditional approach ==>");
        groupingUsingTraditionalApproach.forEach((k,v)-> System.out.println(k +" : "+v));

    }

    private static Map<Department,List<Employee>> employeeWithSameDepartmentUsingJava8(List<Employee> employeeList) {
        return employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)); // using Java 8
    }

    private static Map<Department,List<Employee>> employeeWithSameDepartmentMap(List<Employee> employeeList) {
        Map<Department, List<Employee>> map = new HashMap<>();
        // using traditional approach before java 8
        for (Employee emp : employeeList) {
            if (map.containsKey(emp.getDepartment())) {
                map.get(emp.getDepartment()).add(emp);
            } else {
                List<Employee> newEmployeeList = new ArrayList<>();
                newEmployeeList.add(emp);
                map.put(emp.getDepartment(), newEmployeeList);
            }
        }
        return map;
    }

    private static void showEmpName(List<Employee> employeeList) {
        for(Employee emp : employeeList){
            String[] s = emp.getFullname().split(" ");
            EmployeeMapper object = new EmployeeMapper(s[0],s[1], emp.getSalery(), emp.getDepartment());
            System.out.println(object);

        }
    }

    private static void printEmployee(List<Employee> employeeList) {
        for(Employee emp : employeeList){
            System.out.println(emp);
        }
    }
}
