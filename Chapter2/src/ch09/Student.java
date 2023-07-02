package Chapter2.src.ch09;

public class Student {

    int studentId;
    String studentName;
    Subject korea;
    Subject math;

    Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        korea = new Subject();
        math = new Subject();
    }

    public void setKoreaSubject(String name, int score) {
        korea.subjectName = name;
        korea.score = score;
    }

    public void setMathSubject(String name, int score) {
        math.subjectName = name;
        math.score = score;
    }

    public int getTotalScore() {
        return korea.score + math.score;
    }

}
