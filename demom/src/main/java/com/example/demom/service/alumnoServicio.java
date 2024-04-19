package com.example.demom.service;

import com.example.demom.models.alumno;
import com.example.demom.repository.alumnoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class alumnoServicio {

    @Autowired
    private alumnoRepositorio alumnoRepository;

    public void guardarAlumno(alumno alumno) {
        alumnoRepository.save(alumno);
    }

    
public List<alumno> obtenerTodosLosAlumnos(){
    return alumnoRepository.findAll();
}


}