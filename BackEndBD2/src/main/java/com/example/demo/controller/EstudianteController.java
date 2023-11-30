package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EstudianteDto;
import com.example.demo.model.Estudiante;
import com.example.demo.service.impl.EstudianteServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/estudiante")
public class EstudianteController {
    @Autowired
    EstudianteServiceImpl estudianteService;

    @GetMapping("/all")
    public List<Estudiante> getAllEstudiantes(){
        try {
            return estudianteService.findAll();
        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }

    @GetMapping("/codigo/{codigo}")
    public Optional<Estudiante> porCodigo(@PathVariable(value = "codigo") String codigo){
        try {
            return estudianteService.findByCodigo(codigo);
        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }

    @PostMapping("/nuevo")
    public Estudiante save(@RequestBody EstudianteDto estudiante){
        return estudianteService.save(estudiante);
    }
}
