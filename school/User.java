package school;

public class User {
    private String uId;
    private String uEmail;
    private String uPass;
    private String uRole;

    public User(String uId, String uEmail, String uPass, String uRole) {
        this.uId = uId;
        this.uEmail = uEmail;
        this.uPass = uPass;
        this.uRole = uRole;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getuPass() {
        return uPass;
    }

    public void setuPass(String uPass) {
        this.uPass = uPass;
    }

    public String getuRole() {
        return uRole;
    }

    public void setuRole(String uRole) {
        this.uRole = uRole;
    }

}
