package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"SERVICIO_SOCIAL\"")
public class ServicioSocial {
    
    /* PRIMARY KEY */
    @Id
    private int id_servicio;
    /* ATRIBUTOS PROPIOS */
    @Column
    private String n_responsable;
    @Column
    private String desc_servicio;
    @Column
    private String actividad;

    /* SETTERS Y GETTERS */

    public int getId_servicio() {
        return id_servicio;
    }
    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }
    public String getN_responsable() {
        return n_responsable;
    }
    public void setN_responsable(String n_responsable) {
        this.n_responsable = n_responsable;
    }
    public String getDesc_servicio() {
        return desc_servicio;
    }
    public void setDesc_servicio(String desc_servicio) {
        this.desc_servicio = desc_servicio;
    }
    public String getActividad() {
        return actividad;
    }
    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
    
}
