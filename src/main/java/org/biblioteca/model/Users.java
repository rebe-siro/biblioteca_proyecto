package org.biblioteca.model;

public class Users {
    private int code;
    private String name;
    private int id;
    private int career;
    private int type;
    private boolean status;

public Users(int code, String name, int id, int career, int type, Boolean status) {
	this.code = code;
	this.name = name;
	this.id = id;
    this.career = career;
	this.type = type;
	this.status = status;
}
    
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public int getCareer() {
        return career;
    }

    public void setCareer(int career) {
        this.career = career;
    }

    
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
