package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.SolicitudDao;
import com.example.demo.dto.SolicitudDto;
import com.example.demo.model.Solicitud;
import com.example.demo.service.SolicitudService;

@Service(value = "solicitudService")
public class SolicitudServiceImpl implements SolicitudService{

    @Autowired
    private SolicitudDao solicitudDao;

    @Override
    public List<Solicitud> findAll() {
        return (List<Solicitud>) solicitudDao.findAll();
    }

    @Override
    public Solicitud saveSolicitud(SolicitudDto solicitudInf) {
        Solicitud solicitudAGuardar = solicitudInf.getSolicitudFromDto();
        return solicitudDao.save(solicitudAGuardar);
    }

    @Override
    public Solicitud updateSolicitud(SolicitudDto solicitudInf) {
        Solicitud solicitudActualizar = solicitudInf.getSolicitudFromDto();
        return solicitudDao.save(solicitudActualizar);
    }
    
}
