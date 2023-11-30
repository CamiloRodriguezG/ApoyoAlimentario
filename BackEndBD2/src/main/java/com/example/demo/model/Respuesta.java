package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"RESPUESTA\"")
public class Respuesta {
    @EmbeddedId
    private RespuestaID respuestaPK;
    @Column
    private String respuesta;
    public RespuestaID getRespuestaPK() {
        return respuestaPK;
    }
    public void setRespuestaPK(RespuestaID respuestaPK) {
        this.respuestaPK = respuestaPK;
    }
    public String getRespuesta() {
        return respuesta;
    }
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    
}
