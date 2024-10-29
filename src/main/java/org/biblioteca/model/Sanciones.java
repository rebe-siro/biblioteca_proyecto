package org.biblioteca.model;
        
public class Sanciones {
    private String idSancion;
    private String idUsuario; // ID del usuario sancionado
    private String motivo;
    private int diasSancion; // Días de sanción
    private boolean status;

// Constructor
public Sanciones(String idSancion, String idUsuario, String motivo, int diasSancion, boolean status) {
    this.idSancion = idSancion;
    this.idUsuario = idUsuario;
    this.motivo = motivo;
    this.diasSancion = diasSancion;
    this.status = status;
}

// Métodos
public String getIdSancion() {
    return idSancion;
}

public String getIdUsuario() {
    return idUsuario;
}

public String getMotivo() {
    return motivo;    
}

public int getDiasSanciones() {
    return diasSancion;  
}

 public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean estado) {
        this.status = estado;
    }


    

}