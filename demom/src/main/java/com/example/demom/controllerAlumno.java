package com.example.demom;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controllerAlumno {
    @GetMapping("/")
public String index(){
return "index";
}

@GetMapping("/formulario")
public String formulario(){
return "formulario";
}

@GetMapping("/tablas")
public String tabla01(){
return "tablas";
}
}
