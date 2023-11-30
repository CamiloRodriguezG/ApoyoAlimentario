package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ErrorPL;
import com.example.demo.service.ListadoObjeto;
import com.example.demo.service.impl.ProcedimientoServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/procedimiento")
public class ProcedimientoController {

    @Autowired
    ProcedimientoServiceImpl procedimientoService;

    @PostMapping("/prueba")
    public void prueba() {
        ErrorPL errorPL;
        try {
            errorPL = procedimientoService.prueba();
            System.out.println(errorPL.getMensaje());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }

    @PostMapping("/asigbeneficios")
    public ErrorPL asignarBeneficios(){
        ErrorPL errorPL;
        try {
            errorPL = procedimientoService.prueba();
            return errorPL;
        } catch (Exception e) {
            errorPL = new ErrorPL(999, e.getMessage());
            return errorPL;
        }
    }

    @PostMapping("/asigpuntajes")
    public ErrorPL asignarPuntajes(){
        ErrorPL errorPL;
        try {
            errorPL = procedimientoService.asignarPuntajes();
            return errorPL;
        } catch (Exception e) {
            errorPL = new ErrorPL(999, e.getMessage());
            return errorPL;
        }
    }

    @GetMapping("/obtenerListado/{id_periodo}")
    public ListadoObjeto obtenerListado(@PathVariable(value = "id_periodo") String id_periodo){
        ListadoObjeto listado;
        try {
            listado = procedimientoService.generarListado(id_periodo);
            return listado;
        } catch (Exception e) {
            ErrorPL errorPL = new ErrorPL(999, e.getMessage());
            listado = new ListadoObjeto(errorPL, null);
            return listado;
        }
    }
    
}
