package com.example.demo.model;


import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="\"SOLICITUD\"")
public class Solicitud {

    /* PRIMARY KEY */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_solicitud;
    /* ATRIBUTOS PROPIOS */
    @Column
    private int puntaje;
    @Column
    private Date f_radicacion;
    @Column
    private String estado;
    @Column
    private String linkdocumentos;
    /* FOREIGN KEYS */
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_codigo")
    private Estudiante id_codigo; 
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_periodo")
    private Convocatoria id_periodo;

    /* SETTERS Y GETTERS */
    public int getId_solicitud() {
        return id_solicitud;
    }
    public void setId_solicitud(int id_solicitud) {
        this.id_solicitud = id_solicitud;
    }
    public int getPuntaje() {
        return puntaje;
    }
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    public Date getF_radicacion() {
        return f_radicacion;
    }
    public void setF_radicacion(Date f_radicacion) {
        this.f_radicacion = f_radicacion;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getLinkdocumentos() {
        return linkdocumentos;
    }
    public void setLinkdocumentos(String linkdocumentos) {
        this.linkdocumentos = linkdocumentos;
    }
    public Estudiante getId_codigo() {
        return id_codigo;
    }
    public void setId_codigo(Estudiante id_codigo) {
        this.id_codigo = id_codigo;
    }
    public Convocatoria getId_periodo() {
        return id_periodo;
    }
    public void setId_periodo(Convocatoria id_periodo) {
        this.id_periodo = id_periodo;
    }

    

    

}
