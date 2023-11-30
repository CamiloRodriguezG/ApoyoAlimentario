package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Estudiante;

@Service
public interface EstudianteDao extends CrudRepository<Estudiante, String>{
    
}
