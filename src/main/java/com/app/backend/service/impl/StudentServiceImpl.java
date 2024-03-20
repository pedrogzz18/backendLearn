package com.app.backend.service.impl;

import com.app.backend.model.StudentModel;
import com.app.backend.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    public List<StudentModel> getStudentsList() {
        return this.students;
    }
    public StudentModel createStudent(StudentModel newStudent){
        this.students.add(newStudent);
        return newStudent;
    }
    public StudentModel getStudentById(int id){
        return this.students.get(id);
    }
}
