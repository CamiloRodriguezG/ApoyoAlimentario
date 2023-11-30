package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ConvocatoriaDao;
import com.example.demo.dto.ConvocatoriaDto;
import com.example.demo.model.Convocatoria;
import com.example.demo.service.ConvocatoriaService;

@Service(value = "convocatoriaService")
public class ConvocatoriaServiceImpl implements ConvocatoriaService{

    @Autowired
    private ConvocatoriaDao convocatoriaDao;

    @Override
    public Convocatoria save(ConvocatoriaDto convocatoriaInf) {
        Convocatoria convocatoria = convocatoriaInf.getConvocatoriaFromDto();
        return convocatoriaDao.save(convocatoria);
    }

    @Override
    public List<Convocatoria> findAll() {
        return (List<Convocatoria>) convocatoriaDao.findAll();
    }

    @Override
    public Optional<Convocatoria> findByPeriodo(String periodo) {
        return convocatoriaDao.findById(periodo);
    }
    
}
