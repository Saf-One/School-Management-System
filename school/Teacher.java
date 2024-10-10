package school;

import java.util.ArrayList;

public class Teacher {
    private String tId;
    private String tName;
    private Subject tSubject;
    private User tEmail;
    private User tPass;
    private ArrayList<Class> cId;
    private static int nextId = 1;

    public Teacher(String tName, Subject tSubject, User tEmail, User tPass) {
        this.tId = String.format("T%03d", nextId++);
        this.tName = tName;
        this.tSubject = tSubject;
        this.tEmail = tEmail;
        this.tPass = tPass;
        this.cId = new ArrayList<>();
    }

    public User gettPass() {
        return tPass;
    }

    public void settPass(User tPass) {
        this.tPass = tPass;
    }

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public Subject gettSubject() {
        return tSubject;
    }

    public void settSubject(Subject tSubject) {
        this.tSubject = tSubject;
    }

    public User gettEmail() {
        return tEmail;
    }

    public void settEmail(User tEmail) {
        this.tEmail = tEmail;
    }

    public ArrayList<Class> getcId() {
        return cId;
    }

    public void setcId(ArrayList<Class> cId) {
        this.cId = cId;
    }



    public void assignClass(Class newClass) {
        if (newClass != null) {
            cId.add(newClass);
            newClass.classAssignTeacher(this);
        }
    }
}