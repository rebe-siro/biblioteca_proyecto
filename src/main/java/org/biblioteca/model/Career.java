package model;

public class Carrera {
    private int code;
    private String name;
    private String description;
    private String decanato;
	private char status;
    
public Carrera(int code, String name, String description, String decanato, char status) {
	this.code = code;
	this.name = name;
	this.description = description;
	this.decanato = decanato;
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


public String getDescription() {
    return description;
	}

public void setDescription(String description) {
    this.description = description;
	}


public String getDecanato() {
    return decanato;
	}

public void setDecanto(String decanato) {
    this.decanato = decanato;
	}


public char getStatus() {
    return status;
	}

public void setStatus(char status) {
    this.status = status;
	}
}
