package school;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exam {
    private String eId;
    private String eType;
    private LocalDate eDate;
    private int eMarks;
    private Class eCId;
    private Subject eSId;


    public Exam(String eId, String eType, LocalDate eDate, int eMarks, Class eCId, Subject eSId) {
        this.eId = eId;
        this.eType = eType;
        this.eDate = eDate;
        this.eMarks = eMarks;
        this.eCId = eCId;
        this.eSId = eSId;
    }

    public String getEId() {
        return eId;
    }

    public void setEId(String eId) {
        this.eId = eId;
    }

    public String getEType() {
        return eType;
    }

    public void setEType(String eType) {
        this.eType = eType;
    }

    public LocalDate getEDate() {
        return eDate;
    }

    public void setEDate(LocalDate eDate) {
        this.eDate = eDate;
    }

    public int getEMarks() {
        return eMarks;
    }

    public void setEMarks(int eMarks) {
        this.eMarks = eMarks;
    }

    public Class getECId() {
        return eCId;
    }

    public void setECId(Class eCId) {
        this.eCId = eCId;
    }

    public Subject getESId() {
        return eSId;
    }

    public void setESId(Subject eSId) {
        this.eSId = eSId;
    }

    public long eDaysLeft() {
        LocalDate today = LocalDate.now();
        return ChronoUnit.DAYS.between(today, eDate);
    }
}
