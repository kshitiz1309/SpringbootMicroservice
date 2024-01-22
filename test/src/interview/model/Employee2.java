package interview.model;

public class Employee2 {
    private int EmpId;
            private String EmpName;

    public String getEmpName() {
        return EmpName;
    }

    private long EmpSalary;

    @Override
    public String toString() {
        return "Employee2{" +
                "EmpId=" + EmpId +
                ", EmpName='" + EmpName + '\'' +
                ", EmpSalary=" + EmpSalary +
                '}';
    }

    public Employee2(int empId, String empName, long empSalary) {
        EmpId = empId;
        EmpName = empName;
        EmpSalary = empSalary;
    }
}
