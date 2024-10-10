package school;

import java.time.LocalDate;

public class Notification {
    private String nId;
    private Student sId;
    private Teacher tId;
    private Staff stId;
    private Parent pId;
    private String nTitle;
    private String nBody;
    private LocalDate nDate;

    public Notification(String nId, Student sId, Teacher tId, Staff stId, Parent pId, String nTitle, String nBody, LocalDate nDate) {
        this.nId = nId;
        this.sId = sId;
        this.tId = tId;
        this.stId = stId;
        this.pId = pId;
        this.nTitle = nTitle;
        this.nBody = nBody;
        this.nDate = nDate;
    }

    public String getnId() {
        return nId;
    }

    public void setnId(String nId) {
        this.nId = nId;
    }

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

    public Staff getStId() {
        return stId;
    }

    public void setStId(Staff stId) {
        this.stId = stId;
    }

    public Parent getpId() {
        return pId;
    }

    public void setpId(Parent pId) {
        this.pId = pId;
    }

    public String getnTitle() {
        return nTitle;
    }

    public void setnTitle(String nTitle) {
        this.nTitle = nTitle;
    }

    public String getnBody() {
        return nBody;
    }

    public void setnBody(String nBody) {
        this.nBody = nBody;
    }

    public LocalDate getnDate() {
        return nDate;
    }

    public void setnDate(LocalDate nDate) {
        this.nDate = nDate;
    }
}
