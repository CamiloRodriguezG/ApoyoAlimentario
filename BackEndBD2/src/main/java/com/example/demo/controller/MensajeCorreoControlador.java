package com.example.demo.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Estudiante;
import com.example.demo.service.MensajeCorreoService;
import com.example.demo.service.impl.EstudianteServiceImpl;

@CrossOrigin(origins = "*")
@RestController
public class MensajeCorreoControlador {

    @Autowired
    private MensajeCorreoService emailService;
     @Autowired
    private EstudianteServiceImpl estudiante;
  
    @GetMapping("/enviar-correo")
    public String sendEmail(@RequestParam String mensaje, @RequestParam String codigo) {
        Optional<Estudiante> est = estudiante.findByCodigo(codigo);
         Estudiante estCodigo  = est.get(); 
    	 String destinatario = estCodigo.getEmail();
         String asunto = "Resultado Apoyo Alimentario";
         System.out.println("mensaje: "+mensaje);
         emailService.sendSimpleMessage(destinatario, asunto, mensaje);
        return "Correo electrónico enviado exitosamente.";
    }
}
