package com.example.demom.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;
import java.time.LocalDate;

@Component
@Entity 
public class alumno {
    @Column
    private String Nombre;
    @Column
    private String Apellido;
    @Column 
    private Integer Edad;
    @Column 
    private String Telefono;
    @Column
    private String Direccion;
    @Column 
    private LocalDate FechaDeNacimiento;
    @Id
    private String DNI;
    @Column (name ="state")
private boolean state = true;

// uso del Get y Set (constructores) 

public String setDNI (){
    return DNI; 
}
public void setDNI (String DNI){
    this.DNI = DNI;
} 
 public String getNombre(){
    return Nombre;
 }
 public void setNombre(String  Nombre){
    this.Nombre=  Nombre;
 }
 public String GetApellido(){
    return Apellido;
 }
 public void SetApellido(String Apellido){
    this.Apellido = Apellido;
 }
 public Integer GetEdad(){
    return Edad; 
 }
 public void SetEdad(Integer Edad){
    this.Edad = Edad;
 }

 public String GetTelefono(){
    return Telefono; 
 }
 public void SetTelefono(String Telefono){
    this.Telefono = Telefono;
 }

 public String GetDireccion(){
   return Direccion; 
}
public void SetDireccion(String Direccion){
   this.Direccion = Direccion;
}

public LocalDate GetFechaDeNacimiento(){
   return FechaDeNacimiento; 
}
public void SetFechaDeNacimiento(LocalDate FechaDeNacimiento){
   this.FechaDeNacimiento = FechaDeNacimiento;
}
public boolean GetState(){
   return state; 
}
public void SetState(boolean State){
   this.state= State;
}
}