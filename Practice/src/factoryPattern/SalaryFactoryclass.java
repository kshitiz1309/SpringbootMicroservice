package factoryPattern;

public class SalaryFactoryclass {
    public static EmployeeSalary getSalary(String empType){
        if(empType.trim().equalsIgnoreCase("ANDROID DEVELOPER")){
            return new AndroidSalary();
        } else if (empType.trim().equalsIgnoreCase("WEB DEVELOPER")) {
            return new WebDeveloperSalary();
        }else {
            return null;
        }
    }
}
