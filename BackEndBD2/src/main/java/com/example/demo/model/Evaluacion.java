package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"EVALUACION\"")
public class Evaluacion {

    @EmbeddedId
    private EvaluacionID evaluacionPK;
    @Column
    private String observacion;
    public EvaluacionID getEvaluacionPK() {
        return evaluacionPK;
    }
    public void setEvaluacionPK(EvaluacionID evaluacionPK) {
        this.evaluacionPK = evaluacionPK;
    }
    public String getObservacion() {
        return observacion;
    }
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    
    
}
