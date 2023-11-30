package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.EvaludaroDao;
import com.example.demo.model.Evaluador;
import com.example.demo.service.EvaluadorService;

public class EvaluadorServiceImpl implements EvaluadorService{
    @Autowired
    EvaludaroDao evaludaroDao;

    @Override
    public List<Evaluador> findAll() {
        return (List<Evaluador>) evaludaroDao.findAll();
    }

    @Override
    public Optional<Evaluador> findById(String id_evaluador) {
        return evaludaroDao.findById(id_evaluador);
    }
    
}
