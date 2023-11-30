package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.dto.ConvocatoriaDto;
import com.example.demo.model.Convocatoria;

public interface ConvocatoriaService {
    Convocatoria save(ConvocatoriaDto convocatoriaInf);
    List <Convocatoria> findAll();
    Optional<Convocatoria> findByPeriodo(String periodo);
}
