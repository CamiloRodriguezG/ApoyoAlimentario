package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Evaluador;

public interface EvaluadorService {
    List <Evaluador> findAll();
    Optional<Evaluador> findById(String id_evaluador);
}
