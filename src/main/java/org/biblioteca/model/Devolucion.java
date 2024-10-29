package org.biblioteca.model;

import java.util.Date; 

public class Devolucion {
    private String idDevolucion;
    private String idPrestamo;
    private Date end_Date;
    private boolean status; // true si está en buen estado, false si está dañado

    // Constructor
    public Devolucion(String idDevolucion, String idPrestamo, Date end_Date, boolean status) {
        this.idDevolucion = idDevolucion;
        this.idPrestamo = idPrestamo;
        this.end_Date = end_Date;
        this.status = status;
    }

    // Métodos
    public String getIdDevolucion() {
        return idDevolucion;
    }

    public String getIdPrestamo() {
        return idPrestamo;
    }

    public Date getEnd_Date() {
        return end_Date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean estado) {
        this.status = estado;
    }

    @Override
    public String toString() {
        return "Devolucion{" +
                "idDevolucion='" + idDevolucion + '\'' +
                ", idPrestamo='" + idPrestamo + '\'' +
                ", end_Date='" + end_Date + '\'' +
                ", status =" + status +
                '}';
    }
}
