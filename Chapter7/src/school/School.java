package Chapter7.src.school;

import Chapter2.src.ch18.Company;

import java.util.ArrayList;

public class School {

    private static School instance = new School();    // 유일한 객체
    private String schoolName = "";
    private ArrayList<Student> schoolStudents = new ArrayList<>();
    private ArrayList<Major> schoolMajors = new ArrayList<>();
    private ArrayList<Subject> schoolSubjects = new ArrayList<>();

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    // 싱글톤 패턴
    public static School getInstance() {
        if (instance == null) {
            instance = new School();
        }
        return instance;
    }

    public void addSubject(Subject subject) {
        schoolSubjects.add(subject);
    }
    public void addStudent(Student student) {
        schoolStudents.add(student);
    }

    public void addMajor(Major major) {
        schoolMajors.add(major);
    }

    public ArrayList<Student> getSchoolStudents() {
        return schoolStudents;
    }

    public void setSchoolStudents(ArrayList<Student> schoolStudents) {
        this.schoolStudents = schoolStudents;
    }

    public ArrayList<Major> getSchoolMajors() {
        return schoolMajors;
    }

    public void setSchoolMajors(ArrayList<Major> schoolMajors) {
        this.schoolMajors = schoolMajors;
    }

    public ArrayList<Subject> getSchoolSubjects() {
        return schoolSubjects;
    }

    public void setSchoolSubjects(ArrayList<Subject> schoolSubjects) {
        this.schoolSubjects = schoolSubjects;
    }
}
