package com.app.backend.controller;

import com.app.backend.model.StudentModel;
import com.app.backend.service.impl.StudentServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/")
public interface StudentApiController {
    @GetMapping("/students")
    public List<StudentModel> getAllStudents();
    @PostMapping("/newStudent")
    public StudentModel createStudent(@RequestBody StudentModel newStudent);
    @GetMapping("/students/{id}")
    public StudentModel getStudentById(@PathVariable int id);
}
