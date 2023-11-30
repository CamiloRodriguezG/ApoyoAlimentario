package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class BeneficiarioID {

    @Column
    private String id_codigo;
    @Column
    private int id_solicitud;

    public BeneficiarioID(String id_codigo, int id_solicitud) {
        this.id_codigo = id_codigo;
        this.id_solicitud = id_solicitud;
    }

    public String getId_codigo() {
        return id_codigo;
    }
    public void setId_codigo(String id_codigo) {
        this.id_codigo = id_codigo;
    }
    public int getId_solicitud() {
        return id_solicitud;
    }
    public void setId_solicitud(int id_solicitud) {
        this.id_solicitud = id_solicitud;
    }

}
