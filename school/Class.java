package school;

import java.util.ArrayList;

public class Class {
    private String cId;
    private String cName;
    private String cSection;
    private ArrayList<Student> cStudents;
    private ArrayList<Teacher> cTeachers;

    public Class(String cId, String cName, String cSection) {
        this.cId = cId;
        this.cName = cName;
        this.cSection = cSection;
        this.cStudents = new ArrayList<>();
        this.cTeachers = new ArrayList<>();
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcSection() {
        return cSection;
    }

    public void setcSection(String cSection) {
        this.cSection = cSection;
    }

    public ArrayList<Student> getcStudents() {
        return cStudents;
    }

    public ArrayList<Teacher> getcTeachers() {
        return cTeachers;
    }

    public void classAssignTeacher(Teacher newTeacher) {
        cTeachers.add(newTeacher);
    }
    public void classAssignStudent(Student newStudent) {
        cStudents.add(newStudent);
    }
}