package abstractPattern;

public class AndroidDevFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new Android();
    }
}
