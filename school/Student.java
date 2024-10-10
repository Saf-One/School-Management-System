package school;


import java.util.ArrayList;

public class Student {
    private String sId;
    private String sName;
    private String sRoll;
    private Class cId;
    private Parent sPID;
    private User sEmail;
    private User sPass;
    private Parent sParent;
    private ArrayList<Subject> sSubjectId;
    private static int nextId = 1;
    private static int nextRoll = 1;

    public Student(String sName, Class cId, Parent sPID, User sEmail, User sPass, Parent sParent){
        this.sId = String.format("S%03d", nextId++);
        this.sRoll = String.format("%04d", nextRoll++);
        this.sName = sName;
        this.cId = cId;
        this.sPID = sPID;
        this.sEmail = sEmail;
        this.sPass = sPass;
        this.sParent = sParent;
        this.sSubjectId = new ArrayList<>();
    }

    public void assignSubject(Subject newSubject) {
        if(newSubject != null) {
            sSubjectId.add(newSubject);
            newSubject.subAssignStudent(this);
        }
    }

}
