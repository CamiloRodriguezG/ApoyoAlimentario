package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class EvaluacionID {
    @Column
    private String id_evaluador;
    @Column
    private int id_requerimiento;
    @Column
    private int id_solicitud;
    
    public String getId_evaluador() {
        return id_evaluador;
    }
    public void setId_evaluador(String id_evaluador) {
        this.id_evaluador = id_evaluador;
    }
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
