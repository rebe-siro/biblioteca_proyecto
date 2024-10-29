package org.biblioteca.model;

public class TypeProfile {
    private int code;
    private String description;
    private boolean status;

public TypeProfile (int code, String description, Boolean status) {
	this.code = code;
	this.description = description;
	this.status = status;
}
    
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean isStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}

