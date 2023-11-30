package com.example.demo.dto;

import com.example.demo.model.Estudiante;

public class EstudianteDto {

    private String id_codigo;
    private String programa_academico;
    private int num_matriculas;
    private String facultad;
    private String n_estudiante;
    private int promedio;
    private String email;
    private String id_estado;

    

    public EstudianteDto(String id_codigo, String programa_academico, int num_matriculas, String facultad,
            String n_estudiante, int promedio, String email, String id_estado) {
        this.id_codigo = id_codigo;
        this.programa_academico = programa_academico;
        this.num_matriculas = num_matriculas;
        this.facultad = facultad;
        this.n_estudiante = n_estudiante;
        this.promedio = promedio;
        this.email = email;
        this.id_estado = id_estado;
    }



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
        return id_estado;
    }



    public void setId_estado(String id_estado) {
        this.id_estado = id_estado;
    }



    public Estudiante getEstudianteFromDto(){
        Estudiante estudiante = new Estudiante();
        estudiante.setId_codigo(id_codigo);
        estudiante.setPrograma_academico(programa_academico);
        estudiante.setNum_matriculas(num_matriculas);
        estudiante.setFacultad(facultad);
        estudiante.setN_estudiante(n_estudiante);
        estudiante.setPromedio(promedio);
        estudiante.setEmail(email);
        estudiante.setId_estado(id_estado);
        return estudiante;
    }

    
}
