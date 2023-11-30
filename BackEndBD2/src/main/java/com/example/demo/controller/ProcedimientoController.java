package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ErrorPL;
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
    
}
