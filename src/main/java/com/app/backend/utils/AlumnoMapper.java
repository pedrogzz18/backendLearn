package com.app.backend.utils;

import com.app.backend.model.Alumno;
import com.app.backend.repository.Entity.AlumnoEntity;

import java.sql.Date;

public class AlumnoMapper {

    public static Alumno alumnoEntitytoAlumnoModel(AlumnoEntity alumnoEntity){
        Alumno alumno = new Alumno(
                alumnoEntity.getPrimerNombre(),
                alumnoEntity.getSegundoNombre(),
                alumnoEntity.getApellidoPat(),
                alumnoEntity.getApellidoMat(),
                alumnoEntity.getFechaNac(),
                alumnoEntity.getCurp(),
                alumnoEntity.getEmail());
        return alumno;
    }

    public static  AlumnoEntity alumnoModelToAlumnoEntity(Alumno alumno){

        AlumnoEntity alumnoEntity = new AlumnoEntity(
                alumno.getPrimerNombre(),
                alumno.getSegundoNombre(),
                alumno.getApellidoPat(),
                alumno.getApellidoMat(),
                alumno.getFechaNac(),
                alumno.getCurp(),
                alumno.getEmail()
        );
        return alumnoEntity;
    }
}