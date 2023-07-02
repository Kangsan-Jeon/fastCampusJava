package Chapter2.src.ch04;

import Chapter2.src.ch04.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(); // instance

        studentLee.studentID = 12345;
        studentLee.setStudentName("Lee");
        studentLee.address = "서울 마포구";

        studentLee.showStudentInfo();

        System.out.println(studentLee); // heap메모리 가상 주소(=참조값)
        
    }
}
