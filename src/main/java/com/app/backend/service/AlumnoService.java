package com.app.backend.service;

import com.app.backend.model.Alumno;
import org.springframework.stereotype.Service;

@Service
public interface AlumnoService {

    public void createAlumno(Alumno newStudent);
    public Alumno getAlumnoById(Long id);
}
