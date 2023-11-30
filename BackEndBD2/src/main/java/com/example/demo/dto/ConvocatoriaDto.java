package com.example.demo.dto;

import java.util.Date;

import com.example.demo.model.Convocatoria;

public class ConvocatoriaDto {
    
    private String id_periodo;
    private int num_beneficiarios;
    private Date f_inicio_solicitud;
    private Date f_fin_solicitud;
    private String etapas;



    public ConvocatoriaDto(String id_periodo, int num_beneficiarios, Date f_inicio_solicitud, Date f_fin_solicitud,
            String etapas) {
        this.id_periodo = id_periodo;
        this.num_beneficiarios = num_beneficiarios;
        this.f_inicio_solicitud = f_inicio_solicitud;
        this.f_fin_solicitud = f_fin_solicitud;
        this.etapas = etapas;
    }



    public String getId_periodo() {
        return id_periodo;
    }



    public void setId_periodo(String id_periodo) {
        this.id_periodo = id_periodo;
    }



    public int getNum_beneficiarios() {
        return num_beneficiarios;
    }



    public void setNum_beneficiarios(int num_beneficiarios) {
        this.num_beneficiarios = num_beneficiarios;
    }



    public Date getF_inicio_solicitud() {
        return f_inicio_solicitud;
    }



    public void setF_inicio_solicitud(Date f_inicio_solicitud) {
        this.f_inicio_solicitud = f_inicio_solicitud;
    }



    public Date getF_fin_solicitud() {
        return f_fin_solicitud;
    }



    public void setF_fin_solicitud(Date f_fin_solicitud) {
        this.f_fin_solicitud = f_fin_solicitud;
    }



    public String getEtapas() {
        return etapas;
    }



    public void setEtapas(String etapas) {
        this.etapas = etapas;
    }



    public Convocatoria getConvocatoriaFromDto(){
        Convocatoria convocatoria = new Convocatoria();
        convocatoria.setPeriodo(id_periodo);
        convocatoria.setNumero_beneficiarios(num_beneficiarios);
        convocatoria.setF_inicio_solicitud(f_inicio_solicitud);
        convocatoria.setF_fin_solicitud(f_fin_solicitud);
        convocatoria.setEtapas(etapas);
        return convocatoria; 
    }

}
