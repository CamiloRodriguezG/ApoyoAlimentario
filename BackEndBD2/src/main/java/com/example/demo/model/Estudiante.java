package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"ESTUDIANTE\"")
public class Estudiante {
    
    /* PRIMARY KEY */
    @Id
    private String id_codigo;
    /* ATRIBUTOS PROPIOS */
    @Column
    private String programa_academico;
    @Column
    private int num_matriculas;
    @Column
    private String facultad;
    @Column
    private String n_estudiante;
    @Column
    private int promedio;
    @Column
    private String email;
    @Column
    private String estado;

    /* GETTERS Y SETTERS */
    public String getId_codigo() {
        return id_codigo;
    }
    public void setId_codigo(String id_codigo) {
        this.id_codigo = id_codigo;
    }
    public String getPrograma_academico() {
        return programa_academico;
    }
    public void setPrograma_academico(String programa_academico) {
        this.programa_academico = programa_academico;
    }
    public int getNum_matriculas() {
        return num_matriculas;
    }
    public void setNum_matriculas(int num_matriculas) {
        this.num_matriculas = num_matriculas;
    }
    public String getFacultad() {
        return facultad;
    }
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    public String getN_estudiante() {
        return n_estudiante;
    }
    public void setN_estudiante(String n_estudiante) {
        this.n_estudiante = n_estudiante;
    }
    public int getPromedio() {
        return promedio;
    }
    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getId_estado() {
        return estado;
    }
    public void setId_estado(String estado) {
        this.estado = estado;
    }
    
    

}
