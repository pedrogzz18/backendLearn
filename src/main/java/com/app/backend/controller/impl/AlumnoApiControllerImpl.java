package com.app.backend.controller.impl;

import com.app.backend.controller.AlumnoApiController;
import com.app.backend.model.Alumno;
import com.app.backend.model.Alumno;
import com.app.backend.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlumnoApiControllerImpl implements AlumnoApiController {

    @Autowired
    AlumnoService alumnoService;
    @Override
    public void createAlumno(@RequestBody Alumno newAlumno){
        alumnoService.createAlumno(newAlumno);
    }

    @Override
    public Alumno getAlumnoById(@PathVariable Long id){
        return alumnoService.getAlumnoById(id);
    }

    @Override
    public List<Alumno> getAlumnoList(){
        return alumnoService.getAlumnoList();
    }

    @Override
    public Alumno updateAlumno(Long id, Alumno updatedAlumno){
        return alumnoService.updateAlumno(id, updatedAlumno);
    }

    @Override
    public void deleteAlumno(Long id){
        alumnoService.deleteAlumno(id);
    }
}
