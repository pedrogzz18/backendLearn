package com.app.backend.repository;

import com.app.backend.repository.Entity.AlumnoEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository {
    void insertar(AlumnoEntity alumnoEntity);

    AlumnoEntity getAlumnoById(Long id);
}
