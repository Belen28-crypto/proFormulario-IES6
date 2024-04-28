package com.example.demom.service;

import com.example.demom.models.alumno;
import com.example.demom.repository.alumnoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
public alumno buscadorAlumnoConElDni (String DNI){
    Optional <alumno> optionalAlumno = alumnoRepository.findById(DNI);
    return optionalAlumno .orElse(null);
}


}