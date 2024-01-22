package interview.model;

import interview.model.Department;

public class EmployeeMapper {
    private String firstname;
    private String lastname;
    private long salary;
    private Department department;

    public EmployeeMapper(String firstname, String lastname, long salary, Department department) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return "EmployeeMapper{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }
}
