package org.biblioteca.model;

import java.util.Date;

public class Extension {
    private int code;
    private String user;
    private Date star_Date;
    private Date end_Date;
    private Date new_End_Date;
    private boolean status;

public Extension(int code, String user, Date star_Date, Date end_Date, Date new_End_Date, boolean status) {
	this.code = code;
	this.user = user;
	this.star_Date = star_Date;
    this.end_Date = end_Date;
	this.new_End_Date = new_End_Date;
	this.status = status;
}
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getStar_Date() {
        return star_Date;
    }

    public void setStar_Date(Date star_Date) {
        this.star_Date = star_Date;
    }

    public Date getEnd_Date() {
        return end_Date;
    }

    public void setEnd_Date(Date end_Date) {
        this.end_Date = end_Date;
    }

    public Date getNew_End_Date() {
        return new_End_Date;
    }

    public void setNew_End_Date(Date new_End_Date) {
        this.new_End_Date = new_End_Date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
