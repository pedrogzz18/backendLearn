package com.app.backend.controller.impl;

import com.app.backend.controller.StudentApiController;
import com.app.backend.model.StudentModel;
import com.app.backend.service.StudentService;
import com.app.backend.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentApiControllerImpl implements StudentApiController {

    @Autowired
    StudentService studentService;
    @Override
    public List<StudentModel> getAllStudents(){
        return studentService.getStudentsList();
    }
    @Override
    public StudentModel createStudent(@RequestBody StudentModel newStudent){
        return studentService.createStudent(newStudent);
    }

    @Override
    public StudentModel getStudentById(@PathVariable int id){
        return studentService.getStudentById(id);
    }
    @Override
    public ResponseEntity<String> deleteStudentById(@PathVariable int id){
        return studentService.deleteStudentById(id);
    }
    public ResponseEntity<String> updateStudentById(@PathVariable int id, @RequestBody StudentModel newStudent){
        return studentService.updateStudentById(id, newStudent);
    }
}
