package factoryPattern;

public class AndroidSalary implements EmployeeSalary{
    @Override
    public int salary() {
        System.out.println("Android Developer salary");
        return 50000;
    }
}
