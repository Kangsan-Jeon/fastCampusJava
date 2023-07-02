package Chapter2.src.ch06;

public class Student {

    public int studentNumber;
    public String studentName;
    public int grade;

//    private Student() {} // 디폴트 생성자

    public Student(String studentName, int studentNumber, int grade) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.grade = grade;
        System.out.println("student 생성");
    }
    public String showStudentInfo() {

        return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년입니다.";
    }
}
