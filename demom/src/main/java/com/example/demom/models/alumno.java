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
    private String nombre;
    @Column
    private String apellido;
    @Column 
    private Integer edad;
    @Column 
    private String telefono;
    @Column
    private String direccion;
    @Column 
    private LocalDate fechaDeNacimiento;
    @Id
    private String DNI;
    @Column (name ="state")
private boolean state;

// uso del Get y Set (constructores) 

public String getDNI (){
    return DNI; 
}
public void setDNI (String DNI){
    this.DNI = DNI;
} 
 public String getnombre(){
    return nombre;
 }
 public void setnombre(String nombre){
    this.nombre = nombre;
 }
 public String Getapllido(){
    return apellido;
 }
 public void Setapellido(String apellido){
    this.apellido = apellido;
 }
 public Integer Getedad(){
    return edad; 
 }
 public void Setedad(Integer edad){
    this.edad = edad;
 }

 public String Gettelefono(){
    return telefono; 
 }
 public void Settelefono(String telefono){
    this.telefono = telefono;
 }




}