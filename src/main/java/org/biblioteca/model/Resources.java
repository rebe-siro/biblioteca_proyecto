package org.biblioteca.model;

public class Resources {
    private int code;
    private String title;
    private String description;
    private String autor;
    private int type;
    private boolean status;

    public Resources(int code, String title, String author, int type, boolean status) {
        this.code = code;
        this.title = title;
        this.author = author;
        this.type = type;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
   
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
