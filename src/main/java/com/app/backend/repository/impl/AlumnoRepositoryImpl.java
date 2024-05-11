package com.app.backend.repository.impl;
import com.app.backend.repository.AlumnoRepository;
import com.app.backend.repository.Entity.AlumnoEntity;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import jakarta.persistence.*;
import org.springframework.stereotype.Repository;

import java.util.List;

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
    @Override
    public List<AlumnoEntity> getAlumnoList(){
        TypedQuery<AlumnoEntity> query = em.createQuery("SELECT a FROM Alumno a", AlumnoEntity.class);
        return query.getResultList();
    }

    @Transactional
    public void deleteAlumno(Long id){
        em.remove(getAlumnoById(id));
    }

    @Transactional
    public AlumnoEntity updateAlumno(AlumnoEntity alumnoEntity){
        return em.merge(alumnoEntity);
    }
}
