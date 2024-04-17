package com.app.backend.service;

import com.app.backend.model.StudentModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@Service
public interface StudentService {

    List<StudentModel> students = new ArrayList<>();

    public List<StudentModel> getStudentsList();
    public StudentModel createStudent(StudentModel newStudent);
    public StudentModel getStudentById(int id);
    public ResponseEntity<String> deleteStudentById(int Id);
    public ResponseEntity<String> updateStudentById(int id, StudentModel newStudent);
}
