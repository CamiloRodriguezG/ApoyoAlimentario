package com.example.demo.service;

import com.example.demo.model.ErrorPL;

public interface ProcedimientoService {
    ErrorPL prueba();
    ErrorPL asignarBeneficios();
    ErrorPL asignarPuntajes();
    ListadoObjeto generarListado(String idPeriodo);
}
