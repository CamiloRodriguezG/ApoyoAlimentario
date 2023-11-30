package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.SolicitudDto;
import com.example.demo.model.Solicitud;
import com.example.demo.service.impl.SolicitudServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/solicitud")
public class SolicitudController {
    @Autowired
    private SolicitudServiceImpl solicitudService;

    @GetMapping("/all")
    public List<Solicitud> findAllSolicitudes(){
        try {
            return solicitudService.findAll();
        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }

    @PostMapping("/add")
    public Solicitud createSolicitud(@RequestBody SolicitudDto solicitudDto){
        try {
            return solicitudService.saveSolicitud(solicitudDto);
        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }

    @PostMapping("/update")
    public Solicitud updateSolicitud(@RequestBody SolicitudDto solicitudDto){
        try {
            return solicitudService.updateSolicitud(solicitudDto);
        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }

}
