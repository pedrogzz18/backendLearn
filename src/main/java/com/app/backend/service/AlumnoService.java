package com.app.backend.service;

import com.app.backend.model.Alumno;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AlumnoService {

    public void createAlumno(Alumno newStudent);
    public Alumno getAlumnoById(Long id);

    public void deleteAlumno(Long id);

    public List<Alumno> getAlumnoList();

    public Alumno updateAlumno(long id, Alumno updatedAlumno);
}
