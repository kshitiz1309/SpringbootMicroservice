package interview.model;

public class Employee {
    private String fullname;
    private long salery;
    private Department department;

    public Employee(String fullname, long salery, Department department) {
        this.fullname = fullname;
        this.salery = salery;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullname='" + fullname + '\'' +
                ", salery=" + salery +
                ", department=" + department +
                '}';
    }

    public String getFullname() {
        return fullname;
    }

    public long getSalery() {
        return salery;
    }

    public Department getDepartment() {
        return department;
    }
}
