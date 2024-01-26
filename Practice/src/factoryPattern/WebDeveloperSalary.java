package factoryPattern;

public class WebDeveloperSalary implements EmployeeSalary{
    @Override
    public int salary() {
        System.out.println("Web Developer Salary");
        return 40000;
    }
}
