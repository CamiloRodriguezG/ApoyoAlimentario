package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"REQUERIMIENTO\"")
public class Requerimiento {
    
    /* PRIMARY KEY */
    @Id
    private int id_requerimiento;
    /* ATRIBUTOS PROPIOS */
    @Column
    private String n_requerimiento;
    
    /* SETTERS Y GETTERS */
    public int getId_requerimiento() {
        return id_requerimiento;
    }
    public void setId_requerimiento(int id_requerimiento) {
        this.id_requerimiento = id_requerimiento;
    }
    public String getN_requerimiento() {
        return n_requerimiento;
    }
    public void setN_requerimiento(String n_requerimiento) {
        this.n_requerimiento = n_requerimiento;
    }
    
}
