package com.example.demo.dto;

import java.sql.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.ConvocatoriaDao;
import com.example.demo.dao.EstudianteDao;
import com.example.demo.model.Convocatoria;
import com.example.demo.model.Estudiante;
import com.example.demo.model.Solicitud;
import com.example.demo.service.impl.ConvocatoriaServiceImpl;
import com.example.demo.service.impl.EstudianteServiceImpl;

public class SolicitudDto {

    @Autowired
    EstudianteDao estudianteService;
    @Autowired
    ConvocatoriaDao convocatoriaService;
    
    private int id_solicitud;
    private int puntaje;
    private Date f_radicacion;
    private String estado;
    private String linkdocumentos;
    private String id_codigo;
    private String id_periodo;

    public SolicitudDto(int id_solicitud, int puntaje, Date f_radicacion, String estado, String linkdocumentos,
            String id_codigo, String id_periodo) {
        this.id_solicitud = id_solicitud;
        this.puntaje = puntaje;
        this.f_radicacion = f_radicacion;
        this.estado = estado;
        this.linkdocumentos = linkdocumentos;
        this.id_codigo = id_codigo;
        this.id_periodo = id_periodo;
    }



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



    public String getId_codigo() {
        return id_codigo;
    }



    public void setId_codigo(String id_codigo) {
        this.id_codigo = id_codigo;
    }



    public String getId_periodo() {
        return id_periodo;
    }



    public void setId_periodo(String id_periodo) {
        this.id_periodo = id_periodo;
    }



    public Solicitud getSolicitudFromDto(){
        Solicitud solicitud = new Solicitud();
        Optional<Estudiante> estudiante = estudianteService.findById(id_codigo);
        Optional<Convocatoria> convocatoria = convocatoriaService.findById(id_periodo);
        solicitud.setId_codigo(estudiante.get());
        solicitud.setId_periodo(convocatoria.get());
        solicitud.setId_solicitud(id_solicitud);
        solicitud.setLinkdocumentos(linkdocumentos);
        solicitud.setF_radicacion(f_radicacion);
        solicitud.setEstado(estado);
        solicitud.setPuntaje(puntaje);

        return solicitud;
    }
}
