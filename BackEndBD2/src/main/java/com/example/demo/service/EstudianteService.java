package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.dto.EstudianteDto;
import com.example.demo.model.Estudiante;

public interface EstudianteService {
    Estudiante save(EstudianteDto estudianteInf);
    List <Estudiante> findAll();
    Optional<Estudiante> findByCodigo(String codigo);
}
