package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.model.ErrorPL;
import com.example.demo.service.ProcedimientoService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;

@Service(value = "procedimientoService")
public class ProcedimientoServiceImpl implements ProcedimientoService{


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public ErrorPL prueba() {
        StoredProcedureQuery query = entityManager.createStoredProcedureQuery("pr_prueba");

        // Definir los parámetros de entrada
        query.registerStoredProcedureParameter("pm", String.class, ParameterMode.OUT);
        query.setParameter("pm", null);

        // Ejecutar el procedimiento almacenado
        query.execute();
        return null;
    }

    @Override
    public ErrorPL asignarBeneficios() {
        int codigo;
        String mensaje;

        StoredProcedureQuery query = entityManager.createStoredProcedureQuery("PR_ASIGNAR_BENEFICIO_SOLICITUD");

        // Definir los parámetros de entrada
        query.registerStoredProcedureParameter("pc_error", Number.class, ParameterMode.OUT);
        query.setParameter("pc_error", null);
        query.registerStoredProcedureParameter("pm_error", String.class, ParameterMode.OUT);
        query.setParameter("pm_error", null);

        // Ejecutar el procedimiento almacenado
        query.execute();

        mensaje = (String) query.getOutputParameterValue("pm_error");
        codigo = (int) query.getOutputParameterValue("pc_error");

        return new ErrorPL(codigo, mensaje);

    }
    
}
