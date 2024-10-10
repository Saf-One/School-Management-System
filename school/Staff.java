package school;

public class Staff {
    private String stId;
    private String stName;
    private String stDes;
    private User stEmail;
    private User stPass;
    private static int nextId;

    public Staff(String stName, String stDes, User stEmail, User stPass) {
        this.stId = String.format("ST%03d", nextId++);
        this.stName = stName;
        this.stDes = stDes;
        this.stEmail = stEmail;
        this.stPass = stPass;
    }

    public String getStId() {
        return stId;
    }

    public void setStId(String stId) {
        this.stId = stId;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getStDes() {
        return stDes;
    }

    public void setStDes(String stDes) {
        this.stDes = stDes;
    }

    public User getStEmail() {
        return stEmail;
    }

    public void setStEmail(User stEmail) {
        this.stEmail = stEmail;
    }

    public User getStPass() {
        return stPass;
    }

    public void setStPass(User stPass) {
        this.stPass = stPass;
    }
}
