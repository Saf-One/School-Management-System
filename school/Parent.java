package school;

public class Parent {
    private String pId;
    private Student sId;
    private User pEmail;
    private User pPass;
    private static int nextId=1;

    public Parent(String pId, Student student, User pEmail, User pPass) {
        this.pId = String.format("P%03d", nextId++);
        this.sId = student;
        this.pEmail = pEmail;
        this.pPass = pPass;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public Student getStudent() {
        return sId;
    }

    public void setStudent(Student student) {
        this.sId = student;
    }

    public User getpEmail() {
        return pEmail;
    }

    public void setpEmail(User pEmail) {
        this.pEmail = pEmail;
    }

    public User getpPass() {
        return pPass;
    }

    public void setpPass(User pPass) {
        this.pPass = pPass;
    }
}
