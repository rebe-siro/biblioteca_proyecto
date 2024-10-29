package org.biblioteca.model;
import java.util.Date;

public class Loan {
    private int code;
    private String user;
    private Date star_Date;
    private Date end_Date;
    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getEnd_Date() {
        return end_Date;
    }

    public void setEnd_Date(Date end_Date) {
        this.end_Date = end_Date;
    }

    public Date getStar_Date() {
        return star_Date;
    }

    public void setStar_Date(Date star_Date) {
        this.star_Date = star_Date;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
