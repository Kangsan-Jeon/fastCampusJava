package Chapter2.src.ch06;

public class StudentTest {

    public static void main(String[] args) {

        Student studentKim = new Student("Kim", 1, 1);

//        Student studentLee = new Student(); // Error

        System.out.println(studentKim.showStudentInfo());
    }
}
