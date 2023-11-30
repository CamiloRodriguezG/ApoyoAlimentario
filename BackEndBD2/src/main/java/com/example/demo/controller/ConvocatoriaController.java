package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Convocatoria;
import com.example.demo.service.impl.ConvocatoriaServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/convocatoria")
public class ConvocatoriaController {
    @Autowired
    ConvocatoriaServiceImpl convocatoriaService;

    @GetMapping("/all")
    public List<Convocatoria> getAllConvocatorias(){
        try {
            return convocatoriaService.findAll();
        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }

    @GetMapping("/periodo/{periodo}")
    public Optional<Convocatoria> porPeriodo(@PathVariable(value = "periodo") String periodo){
        try {
            return convocatoriaService.findByPeriodo(periodo);
        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }
    
}
