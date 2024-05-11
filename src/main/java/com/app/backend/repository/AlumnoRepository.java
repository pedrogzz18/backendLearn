package com.app.backend.repository;

import com.app.backend.model.Alumno;
import com.app.backend.repository.Entity.AlumnoEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlumnoRepository {
    void insertar(AlumnoEntity alumnoEntity);

    AlumnoEntity getAlumnoById(Long id);

    List<AlumnoEntity> getAlumnoList();

    void deleteAlumno(Long id);

    AlumnoEntity updateAlumno(AlumnoEntity alumnoEntity);

}
