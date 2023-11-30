package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.SolicitudDto;
import com.example.demo.model.Solicitud;

public interface SolicitudService {
    List<Solicitud> findAll();
    Solicitud saveSolicitud(SolicitudDto solicitudInf);
    Solicitud updateSolicitud(SolicitudDto solicitudInf);
}
