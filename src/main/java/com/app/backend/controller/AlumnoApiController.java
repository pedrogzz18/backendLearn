package com.app.backend.controller;

import com.app.backend.model.Alumno;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/")
public interface AlumnoApiController {
    @PostMapping("/create-alumno")
    public void createAlumno(@RequestBody Alumno newAlumno);
    @GetMapping("/alumno/{id}")
    public Alumno getAlumnoById(@PathVariable Long id);

    @GetMapping("/alumno")
    public List<Alumno> getAlumnoList();

    @PutMapping("/update-alumno/{id}")
    public Alumno updateAlumno(@PathVariable Long id, Alumno updatedAlumno);
    @DeleteMapping("/delete-alumno/{id}")
    public void deleteAlumno(@PathVariable Long id);
}
