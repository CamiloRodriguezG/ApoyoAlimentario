package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"BENEFICIARIO\"")
public class Beneficiario {
    /* PRIMARY KEY COMPUESTA */
    @EmbeddedId
    private BeneficiarioID beneficiarioPK;
    /* ATRIBUTOS PROPIOS */
    @Column
    private String estado_servicio;
    @Column
    private String email;
    /* FOREIGN KEYS */
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_plan")
    private Plan id_plan;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_tipo_apoyo")
    private TipoApoyo id_tipo_apoyo;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_servicio")
    private ServicioSocial id_servicio;

    /* SETTERS Y GETTERS */
    public BeneficiarioID getBeneficiarioPK() {
        return beneficiarioPK;
    }
    public void setPrimaryKeyBeneficiario(BeneficiarioID primaryKeyBeneficiario) {
        this.beneficiarioPK = primaryKeyBeneficiario;
    }
    // public Solicitud getSolicitud() {
    //     return solicitud;
    // }
    // public void setSolicitud(Solicitud solicitud) {
    //     this.solicitud = solicitud;
    // }
    public String getEstado_servicio() {
        return estado_servicio;
    }
    public void setEstado_servicio(String estado_servicio) {
        this.estado_servicio = estado_servicio;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Plan getId_plan() {
        return id_plan;
    }
    public void setId_plan(Plan id_plan) {
        this.id_plan = id_plan;
    }
    public TipoApoyo getId_tipo_apoyo() {
        return id_tipo_apoyo;
    }
    public void setId_tipo_apoyo(TipoApoyo id_tipo_apoyo) {
        this.id_tipo_apoyo = id_tipo_apoyo;
    }
    public ServicioSocial getId_servicio() {
        return id_servicio;
    }
    public void setId_servicio(ServicioSocial id_servicio) {
        this.id_servicio = id_servicio;
    }

}
