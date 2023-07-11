package Chapter2.src.ch23;

import java.util.ArrayList;

public class Student {
    int studentNum;
    String name;
    ArrayList<Subject> subjects = new ArrayList<>();
    int totalScore = 0;
    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    public void addSubject(String subject, int score) {
        this.subjects.add(new Subject(subject, score));
    }

    public void showStudentInfo() {
        for (int i=0; i<subjects.size(); i++) {
            System.out.println("학생 " + name + "의 "+ subjects.get(i).getSubject() +" 과목 성적은 "+ subjects.get(i).getScore() +"입니다.");
            totalScore += subjects.get(i).getScore();
        }
        System.out.println("학생 " + name + "의 총점은 "+ totalScore +"입니다.");
    }

}
