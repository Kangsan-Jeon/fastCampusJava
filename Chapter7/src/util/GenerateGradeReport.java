package Chapter7.src.util;

//import Chapter7.src.grade.BasicGradeEvaluate;
import Chapter7.src.school.Major;
import Chapter7.src.school.School;
import Chapter7.src.school.Student;
import Chapter7.src.school.Subject;

import java.util.ArrayList;

public class GenerateGradeReport {

    private School school = School.getInstance();
    String split = "-----------------------------------------\n";
    String header = "\t이름\t|\t학번\t|\t필수여부\t|\t점수\n";

    public GenerateGradeReport() {};

    public String getReport() {
        String report = split;
        ArrayList<Subject> subjects = school.getSchoolSubjects();
        for (Subject subject:subjects){
            report += getSubjectReport(subject);
        }
        return report;
    }

    public String getSubjectReport(Subject subject) {
        String subjectReport = "\t\t\t" + subject.getSubjectName() + " 수강생 학점\n" + header+split;
        ArrayList<Student> students = subject.getStudents();
        for (Student student:students) {
            subjectReport += getStudentReport(student, subject);
        }
        return subjectReport;
    }
    public String getStudentReport(Student student, Subject subject) {
        boolean isRequired = isRequiredSubject(student.getMajor(), subject);
        String grade="";
//        if (isRequired)
//            grade = new BasicGradeEvaluate().getGrade(student.getSubjectScore(subject));
        return student.getStudentName() + "\t|\t" + student.getStudentId() + "\t|\t" + isRequired + "\t|\t" + student.getSubjectScore(subject)+ ':' + grade +  "\t|\n" + split;
    }

    public boolean isRequiredSubject(Major major, Subject subject){
        if (major.getRequiredSubjects().contains(subject))
            return true;
        else
            return false;
    }
}
