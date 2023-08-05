package Chapter7.src.school;

import Chapter7.src.school.Subject;

import java.util.ArrayList;

public class Major {
    private String majorName;
    private ArrayList<Subject> requiredSubjects = new ArrayList<>();

    public Major(String majorName) {
        this.majorName = majorName;
    }

    public Major(String majorName, Subject subject) {
        this.majorName = majorName;
        this.requiredSubjects.add(subject);
    }


    public Major(String majorName, ArrayList<Subject> requiredSubjects) {
        this.majorName = majorName;
        this.requiredSubjects = requiredSubjects;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public ArrayList<Subject> getRequiredSubjects() {
        return requiredSubjects;
    }

    public void setRequiredSubjects(ArrayList<Subject> requiredSubjects) {
        this.requiredSubjects = requiredSubjects;
    }

    @Override
    public String toString() {
        return "Major{" +
                "majorName='" + majorName + '\'' +
                ", requiredSubjects=" + requiredSubjects +
                '}';
    }
}
