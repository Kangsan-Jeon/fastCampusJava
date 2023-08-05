package Chapter7.src.school;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String studentName;
    private int studentId;
    private Major major;
    private HashMap<Subject, Integer> subjectScoreMap = new HashMap<>();

    public Student(int studentId, String studentName, Major major) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.major = major;
    }

    public Student(int studentId, String studentName, Major major, Subject subject) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.major = major;
        this.subjectScoreMap.put(subject, null);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public void addSubject(Subject subject) {
        System.out.println(studentName+" 학생이 " + subject.getSubjectName() + " 과목을 추가하였습니다.");
        subjectScoreMap.put(subject, null);
    }

    public void removeSubject(String subjectName) {
        boolean isFind = false;
        for (Subject subject:subjectScoreMap.keySet()) {
            if (subject.getSubjectName() == subjectName) {
                isFind = true;
                subjectScoreMap.remove(subject);
                break;
            }
        }
        if (isFind)
            System.out.println(subjectName+" 수강을 취소하였습니다.");
        else
            System.out.println(studentName+ " 학생은 " + subjectName +" 과목을 수강하지 않습니다.");
    }

    public void addSubjectScore(Subject subject, int score) {
        if (subjectScoreMap.containsKey(subject)) {
            subjectScoreMap.replace(subject, score);
            System.out.println(studentName+" 학생의 " + subject.getSubjectName() + " 과목의 점수는 " + score + "점 입니다." );
        }
        else
            System.out.println(studentName + " 학생은 " + subject.getSubjectName() + " 과목을 수강하지 않습니다.");
    }

    public int getSubjectScore(Subject subject) {
        if (subjectScoreMap.containsKey(subject)) {
            return subjectScoreMap.get(subject);
        }
        else
            System.out.println(studentName + " 학생은 " + subject.getSubjectName() + " 과목을 수강하지 않습니다.");
        return -1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentId=" + studentId +
                ", major=" + major +
                ", subjectScoreMap=" + subjectScoreMap +
                '}';
    }
}
