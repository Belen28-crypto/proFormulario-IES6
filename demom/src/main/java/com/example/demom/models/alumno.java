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

public String getDNI (){
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
 public String getApellido(){
    return Apellido;
 }
 public void setApellido(String Apellido){
    this.Apellido = Apellido;
 }

 public String getTelefono(){
    return Telefono; 
 }
 public void setTelefono(String Telefono){
    this.Telefono = Telefono;
 }

 public String getDireccion(){
   return Direccion; 
}
public void setDireccion(String Direccion){
   this.Direccion = Direccion;
}

public LocalDate getFechaDeNacimiento(){
   return FechaDeNacimiento; 
}
public void setFechaDeNacimiento(LocalDate FechaDeNacimiento){
   this.FechaDeNacimiento = FechaDeNacimiento;
}
public boolean getState(){
   return state; 
}
public void setState(boolean State){
   this.state= State;
}
}