package com.app.backend.controller;

import com.app.backend.model.Alumno;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/")
public interface AlumnoApiController {
    @PostMapping("/create-alumno")
    public void createAlumno(@RequestBody Alumno newAlumno);
    @GetMapping("/alumno/{id}")
    public Alumno getAlumnoById(@PathVariable Long id);
}
