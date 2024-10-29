package org.biblioteca.model;

public class Biblioteca {
	private int code;
	private String name;
	private String dean;
	private String deanery;
	private Boolean status;
	
	public Biblioteca(int code, String name, String dean, String deanery, Boolean status) {
		this.code = code;
		this.name = name;
		this.dean = dean;
		this.deanery = deanery;
		this.status = status;
	}
	
public int getCode () {
		return code; 
	}
	
public void setCode (int code) {
		this.code = code;
	}
	
	
public String getName() {
		return name; 
	}
	
public void setName (String name) {
		this.name = name;
	}

	
public String getDean () {
		return dean; 
	}
	
public void setDean (String dean) {
		this.dean = dean;
	}
	
	
public String getDeanery () {
		return deanery; 
	}
	
public void setDeanery (String deanery) {
		this.deanery = deanery;
	}
	

public Boolean getStatus() {
    return status;
	}

public void setStatus(Boolean status) {
    this.status = status;
	}
}
