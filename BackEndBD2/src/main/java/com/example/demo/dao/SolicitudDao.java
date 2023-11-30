package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Solicitud;

@Service
public interface SolicitudDao extends CrudRepository<Solicitud, Integer>{
    
}
