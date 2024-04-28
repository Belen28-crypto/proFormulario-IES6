package com.example.demom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;


import com.example.demom.models.alumno;
import com.example.demom.service.alumnoServicio;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

import java.util.stream.Collectors;

@Controller

public class controllerAlumno {
    @Autowired
    private alumnoServicio alumnoServicio;
    @GetMapping("/")
public String index(){
return "index";
}

@GetMapping("/formulario")
public String formulario(Model model){
    model.addAttribute("alumno", new alumno());
return "formulario";
}

@GetMapping("/tablas")
public String tabla01(Model model){
    List<alumno> listaAlumnos = alumnoServicio.obtenerTodosLosAlumnos();
    List<alumno> alumnosConEstadoTrue = listaAlumnos.stream()
    .filter(alumno -> Boolean.TRUE.equals(alumno.getState()))
    .collect(Collectors.toList());
    model.addAttribute("listaAlumnos",alumnosConEstadoTrue);

return "tablas";
}


@PostMapping ("/guardarAlumno")
public String guardarAlumno (@ModelAttribute alumno alumno){
 alumnoServicio.guardarAlumno(alumno);
 return "redirect:/tablas"; 
}

// post-busca los datos y se implementa una conexión con la carpeta
@PostMapping ("/eliminarAlumno/{DNI}")
public String eliminarAlumno (@PathVariable String DNI) {
    alumno alumno = alumnoServicio.buscadorAlumnoConElDni (DNI);
    if (alumno != null) {
        alumno.setState(false);
        alumnoServicio.guardarAlumno(alumno); 
    }
    return "redirect:/tablas";
}

@PostMapping ("/editarAlumno/{DNI}")
public String editarAlumno (@PathVariable String DNI, Model model){
  alumno alumno = alumnoServicio.buscadorAlumnoConElDni(DNI);
  if (alumno != null){
    model.addAttribute("alumno",alumno); 
    return "formularioActualizarAlumno";
  }else{
    return "redirect:/tablas";
  }
  }


}



