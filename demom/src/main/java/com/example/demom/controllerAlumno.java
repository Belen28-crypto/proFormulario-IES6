package com.example.demom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;


import com.example.demom.models.alumno;
import com.example.demom.service.alumnoServicio;
import org.springframework.web.bind.annotation.PostMapping;


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
public String tabla01(){
return "tablas";
}


@PostMapping ("/guardarAlumno")
public String guardarAlumno (@ModelAttribute alumno alumno){
 alumnoServicio.guardarAlumno(alumno);
 return "redirect/"; 
}
}



