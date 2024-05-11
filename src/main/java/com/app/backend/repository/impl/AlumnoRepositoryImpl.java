package com.app.backend.repository.impl;
import com.app.backend.repository.AlumnoRepository;
import com.app.backend.repository.Entity.AlumnoEntity;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import jakarta.persistence.*;
import org.springframework.stereotype.Repository;

@Repository
public class AlumnoRepositoryImpl implements AlumnoRepository{

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void insertar(AlumnoEntity alumnoEntity){
        em.getTransaction().begin();
        em.persist(alumnoEntity);
        em.getTransaction().commit();
    }

    @Override
    public AlumnoEntity getAlumnoById(Long id){
        return em.find(AlumnoEntity.class, id);
    }
}
