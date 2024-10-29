package org.biblioteca.model;

import java.util.Date; 

public class Return {
    private String id;
    private String idLoan;
    private Date end_Date;
    private boolean status; // true si está en buen estado, false si está dañado

    // Constructor
    public Return(String id, String idLoan, Date end_Date, boolean status) {
        this.id = id;
        this.idLoan = idLoan;
        this.end_Date = end_Date;
        this.status = status;
    }

    // Métodos
    public String getId() {
        return idDevolucion;
    }

    public String getIdloan() {
        return idPrestamo;
    }

    public Date getEnd_Date() {
        return end_Date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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
