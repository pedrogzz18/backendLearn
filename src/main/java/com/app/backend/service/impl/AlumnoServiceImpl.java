package com.app.backend.service.impl;

import com.app.backend.model.Alumno;
import com.app.backend.repository.AlumnoRepository;
import com.app.backend.repository.Entity.AlumnoEntity;
import com.app.backend.service.AlumnoService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    public void createAlumno(Alumno newAlumno){
        AlumnoEntity alumnoEntity = new AlumnoEntity(
                newAlumno.getPrimerNombre(),
                newAlumno.getSegundoNombre(),
                newAlumno.getApellidoPat(),
                newAlumno.getApellidoMat(),
                newAlumno.getFechaNac(),
                newAlumno.getCurp(),
                newAlumno.getEmail()
        );
        alumnoRepository.insertar(alumnoEntity);
    }

    @Nullable
    public Alumno getAlumnoById(Long id){
        AlumnoEntity alumnoEntity = alumnoRepository.getAlumnoById(id);
        Alumno alumno = new Alumno(alumnoEntity.getPrimerNombre(),
                alumnoEntity.getSegundoNombre(),
                alumnoEntity.getApellidoPat(),
                alumnoEntity.getApellidoMat(),
                alumnoEntity.getFechaNac(),
                alumnoEntity.getCurp(),
                alumnoEntity.getEmail());
        return alumno;
    }
}
