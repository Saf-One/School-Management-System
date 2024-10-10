package school;

import java.util.ArrayList;
import java.util.Date;

public class Result {
    private Student sId;
    private Teacher tId;
    private ArrayList<Subject> subjId;
    private int marks;
    private Exam eMarks;
    private Exam eDate;

    public Student getsId() {
        return sId;
    }

    public void setsId(Student sId) {
        this.sId = sId;
    }

    public Teacher gettId() {
        return tId;
    }

    public void settId(Teacher tId) {
        this.tId = tId;
    }

    public ArrayList<Subject> getSubjId() {
        return subjId;
    }

    public void setSubjId(ArrayList<Subject> subjId) {
        this.subjId = subjId;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Exam geteMarks() {
        return eMarks;
    }

    public void seteMarks(Exam eMarks) {
        this.eMarks = eMarks;
    }

    public Exam geteDate() {
        return eDate;
    }

    public void seteDate(Exam eDate) {
        this.eDate = eDate;
    }

    public Result(Student sId, Teacher tId, ArrayList<Subject> subjId, int marks, Exam eMarks, Exam eDate) {
        this.sId = sId;
        this.tId = tId;
        this.subjId = subjId;
        this.marks = marks;
        this.eMarks = eMarks;
        this.eDate = eDate;
    }
}
