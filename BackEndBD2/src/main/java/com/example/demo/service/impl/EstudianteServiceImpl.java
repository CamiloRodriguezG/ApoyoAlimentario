package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EstudianteDao;
import com.example.demo.dto.EstudianteDto;
import com.example.demo.model.Estudiante;
import com.example.demo.service.EstudianteService;

@Service(value = "estudianteService")
public class EstudianteServiceImpl implements EstudianteService{
    @Autowired
    private EstudianteDao estudianteDao;

    @Override
    public Estudiante save(EstudianteDto estudianteInf) {
        Estudiante estudiante = estudianteInf.getEstudianteFromDto();
        return estudianteDao.save(estudiante);
    }


    @Override
    public List<Estudiante> findAll() {
        List<Estudiante> estudiantes =  (List<Estudiante>) estudianteDao.findAll();
        return (List<Estudiante>) estudianteDao.findAll();
    }

    @Override
    public Optional<Estudiante> findByCodigo(String codigo) {
        return estudianteDao.findById(codigo);
    }
    
}
