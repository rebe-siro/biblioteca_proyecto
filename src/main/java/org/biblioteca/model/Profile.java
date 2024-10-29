package org.biblioteca.model;

public class TypeProfile {
    private int code;
    private String name;
    private int career;
    private int deanery;
    private String id;
    private String password;
    private boolean status;

public TypeProfile (int code, String name, int career, int deanery, String id, String password, Boolean status) {
	this.code = code;
  this.name = name;
  this.career = career;
	this.deanery = deanery;
  this.id = id;
  this.password = password;
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




    public int getCareer() {
        return career;
    }

    public void setCareer(int career) {
        this.career = career;
    }




    public int getDeanery() {
        return deanery;
    }

    public void setDeanery(int deanery) {
        this.dwanery = dwanery;
    }




    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


  

      public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


  

    public Boolean isStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
