package factoryPattern;

public class FactoryClient {
    public static void main(String[] args) {
        EmployeeSalary employeeSalary = SalaryFactoryclass.getSalary("ANDROID DEVELOPER");
        System.out.println(employeeSalary.salary());
        EmployeeSalary employeeSalary1 = SalaryFactoryclass.getSalary("WEB DEVELOPER");
        System.out.println(employeeSalary1.salary());
    }
}
