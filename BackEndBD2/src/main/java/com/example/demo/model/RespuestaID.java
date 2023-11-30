package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class RespuestaID {
    @Column
    private int id_requerimiento;
    @Column
    private int id_solicitud;
    public int getId_requerimiento() {
        return id_requerimiento;
    }
    public void setId_requerimiento(int id_requerimiento) {
        this.id_requerimiento = id_requerimiento;
    }
    public int getId_solicitud() {
        return id_solicitud;
    }
    public void setId_solicitud(int id_solicitud) {
        this.id_solicitud = id_solicitud;
    }

    
}
