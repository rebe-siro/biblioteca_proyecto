package org.biblioteca.model;
        
public class Sanctions {
    private int code;
    private String description;
    private Boolean status;

public Sanctions(int code, String description, Boolean status) {
    this.code = code;
    this.description = description;
    this.status = status;
}

public String getCode() {
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

        
public boolean isStatus() {
        return status;
}

public void setStatus(boolean estado) {
        this.status = estado;
    }
}
