package school;

import java.util.Date;

public class Attendance {
    public Class cId;
    public Student sId;
    public Date date;
    public int attendance;

    public Attendance(Class cId, Student sId, Date date, int attendance) {
        this.cId = cId;
        this.sId = sId;
        this.date = date;
        this.attendance = attendance;
    }

    public Class getcId() {
        return cId;
    }

    public void setcId(Class cId) {
        this.cId = cId;
    }

    public Student getsId() {
        return sId;
    }

    public void setsId(Student sId) {
        this.sId = sId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }


}
