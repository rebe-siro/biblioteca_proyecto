package org.biblioteca.model;

public class TypeProfile {
    private int code;
    private String name;
    private boolean status;

public TypeProfile (int code, String name, Boolean status) {
	this.code = code;
	this.name = name;
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

    public Boolean isStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}

