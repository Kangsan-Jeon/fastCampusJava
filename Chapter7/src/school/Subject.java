package Chapter7.src.school;

import Chapter7.src.school.Student;

import java.util.ArrayList;

public class Subject {
    private String subjectName;
    private ArrayList<Student> students = new ArrayList<>();

    public Subject(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void register(Student student) {
        students.add(student);
        student.addSubject(this);
        System.out.println(student.getStudentName()+" 학생이 "+subjectName + " 과목을 수강합니다.");
    }

    public void remove(Student student) {
        if (students.remove(student))
            System.out.println(student.getStudentName() + " 학생이 " + subjectName + " 과목을 수강취소하였습니다.");
        else
            System.out.println(student.getStudentName() + " 학생은 " + subjectName + " 과목을 수강하고 있지 않습니다." );
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                '}';
    }
}
