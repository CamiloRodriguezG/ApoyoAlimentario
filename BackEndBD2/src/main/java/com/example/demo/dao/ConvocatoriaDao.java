package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Convocatoria;

@Service
public interface ConvocatoriaDao extends CrudRepository<Convocatoria, String>{
    
}
