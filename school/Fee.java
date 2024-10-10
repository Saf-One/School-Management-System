package school;

public class Fee {
    private Student sId;
    private double fee;
    private Boolean due;
    private String desc;

    public Fee(Student sId, double fee, Boolean due, String desc) {
        this.sId = sId;
        this.fee = fee;
        this.due = due;
        this.desc = desc;

    }

    public Student getsId() {
        return sId;
    }

    public void setsId(Student sId) {
        this.sId = sId;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public Boolean getDue() {
        return due;
    }

    public void setDue(Boolean due) {
        this.due = due;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
