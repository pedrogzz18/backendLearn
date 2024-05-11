package com.app.backend.service.impl;

import com.app.backend.model.Alumno;
import com.app.backend.repository.AlumnoRepository;
import com.app.backend.repository.Entity.AlumnoEntity;
import com.app.backend.service.AlumnoService;
import com.app.backend.utils.AlumnoMapper;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    public void createAlumno(Alumno newAlumno){
        AlumnoEntity alumnoEntity = AlumnoMapper.alumnoModelToAlumnoEntity(newAlumno);
        alumnoRepository.insertar(alumnoEntity);
    }

    @Nullable
    public Alumno getAlumnoById(Long id){
        AlumnoEntity alumnoEntity = alumnoRepository.getAlumnoById(id);
        Alumno alumno = AlumnoMapper.alumnoEntitytoAlumnoModel(alumnoEntity);
        return alumno;
    }

    @Override
    public void deleteAlumno(Long id){
        alumnoRepository.deleteAlumno(id);
    }

    @Override
    public List<Alumno> getAlumnoList(){
        List<AlumnoEntity> alumnoEntityList = alumnoRepository.getAlumnoList();
        List<Alumno> alumnoList = new ArrayList<>();
        for(AlumnoEntity alumnoEntity : alumnoEntityList){
            alumnoList.add(AlumnoMapper.alumnoEntitytoAlumnoModel(alumnoEntity));
        }
       return alumnoList;
    }

    @Override
    public Alumno updateAlumno(long id, Alumno updatedAlumno){
        Alumno existingAlumno = getAlumnoById(id);
        if (existingAlumno != null) {
            existingAlumno.setPrimerNombre(updatedAlumno.getPrimerNombre());
            existingAlumno.setSegundoNombre(updatedAlumno.getSegundoNombre());
            existingAlumno.setApellidoPat(updatedAlumno.getApellidoPat());
            existingAlumno.setApellidoMat(updatedAlumno.getApellidoMat());
            existingAlumno.setCurp(updatedAlumno.getCurp());
            existingAlumno.setFechaNac(updatedAlumno.getFechaNac());
            existingAlumno.setEmail(updatedAlumno.getEmail());
        }
        return AlumnoMapper.alumnoEntitytoAlumnoModel(alumnoRepository.updateAlumno(AlumnoMapper.alumnoModelToAlumnoEntity(existingAlumno)));
    }
}
