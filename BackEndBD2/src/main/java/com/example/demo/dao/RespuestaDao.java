package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Respuesta;
import com.example.demo.model.RespuestaID;

@Service
public interface RespuestaDao extends CrudRepository<Respuesta, RespuestaID>{   
}
