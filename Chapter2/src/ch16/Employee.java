package Chapter2.src.ch16;

public class Employee {

    private static int serialNum = 1000;
    private int employeeId;
    private String employeeName;
    private String department;

    public Employee() {
        this.employeeId = serialNum;
        serialNum++;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
