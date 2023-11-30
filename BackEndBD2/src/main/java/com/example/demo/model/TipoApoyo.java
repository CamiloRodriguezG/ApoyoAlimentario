package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"TIPO_APOYO\"")
public class TipoApoyo {
    
    /* PRIMARY KEY */
    @Id
    private int id_tipo_apoyo;
    /* ATRIBUTOS PROPIOS */
    @Column
    private String tipo_apoyo;
    @Column
    private int cantidad;
    /* FOREING KEYS */
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_periodo")
    private Convocatoria id_periodo;

    /*SETTERS Y GETTERS */
    public int getId_tipo_apoyo() {
        return id_tipo_apoyo;
    }
    public void setId_tipo_apoyo(int id_tipo_apoyo) {
        this.id_tipo_apoyo = id_tipo_apoyo;
    }
    public String getTipo_apoyo() {
        return tipo_apoyo;
    }
    public void setTipo_apoyo(String tipo_apoyo) {
        this.tipo_apoyo = tipo_apoyo;
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
