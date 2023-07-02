package Chapter2.src.ch09;

public class SubjectTest {
    public static void main(String[] args) {
        Student Lee = new Student(1, ":Lee");
        Lee.setKoreaSubject("국어", 90);
        Lee.setMathSubject("수학", 100);

        System.out.println(Lee.getTotalScore());
    }
}
