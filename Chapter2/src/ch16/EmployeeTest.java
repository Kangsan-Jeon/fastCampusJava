package Chapter2.src.ch16;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("Lee");

        System.out.println(employeeLee.getEmployeeName()+"님의 사번은 "+employeeLee.getEmployeeId()+"입니다.");

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("Kim");

        System.out.println(employeeKim.getEmployeeName()+"님의 사번은 "+employeeKim.getEmployeeId()+"입니다.");

//        System.out.println(Employee.serialNum);     // static 변수는 클래스이름으로 호출

        System.out.println(Employee.getSerialNum());
    }
}
