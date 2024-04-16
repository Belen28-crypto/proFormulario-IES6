package com.example.demom.repository;


import com.example.demom.models.alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface alumnoRepositorio extends JpaRepository<alumno, String> {
}