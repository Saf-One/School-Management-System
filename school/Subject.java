package school;

import java.util.ArrayList;

public class Subject {
    private String subjId;
    private String sName;
    private ArrayList<Student> sStudents;
    private ArrayList<Teacher> sTeachers;

    public Subject(String subjId, String sName) {
        this.subjId = subjId;
        this.sName = sName;
        this.sStudents = new ArrayList<>();
        this.sTeachers = new ArrayList<>();
    }

    public String getSId() {
        return subjId;
    }

    public void setSId(String sId) {
        this.subjId = sId;
    }

    public String getSName() {
        return sName;
    }

    public void setSName(String sName) {
        this.sName = sName;
    }

    public void subAssignTeacher(Teacher newTeacher){
        sTeachers.add(newTeacher);
    }

    public void subAssignStudent(Student newStudent){
        sStudents.add(newStudent);
    }
}
