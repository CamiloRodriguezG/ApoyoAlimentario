package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"PLAN\"")
public class Plan {
    /* PRIMARY KEY */
    @Id
    private int id_plan;
    @Column
    private String plan;
    @Column
    private int cantidad;
    /* FOREIGN KEYS */
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_periodo")
    private Convocatoria id_periodo;

    /* SETTERS Y GETTERS */

    public int getId_plan() {
        return id_plan;
    }
    public void setId_plan(int id_plan) {
        this.id_plan = id_plan;
    }
    public String getPlan() {
        return plan;
    }
    public void setPlan(String plan) {
        this.plan = plan;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public Convocatoria getId_periodo() {
        return id_periodo;
    }
    public void setId_periodo(Convocatoria id_periodo) {
        this.id_periodo = id_periodo;
    }
    
}
