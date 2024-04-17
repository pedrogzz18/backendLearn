package com.app.backend.service.impl;

import com.app.backend.model.StudentModel;
import com.app.backend.service.StudentService;
import jakarta.annotation.Nullable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.lang.model.type.NullType;
import java.net.http.HttpResponse;
import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@Service
public class StudentServiceImpl implements StudentService {
    public List<StudentModel> getStudentsList() {
        return this.students;
    }
    public StudentModel createStudent(StudentModel newStudent){
        this.students.add(newStudent);
        return newStudent;
    }
    @Nullable
    public StudentModel getStudentById(int id){
        for(StudentModel student : this.students){
            if(student.getId() == id){
                return student;
            }
        }
        return null;
    }

    public ResponseEntity<String> deleteStudentById(int id){
        for(StudentModel student : this.students){
            if(student.getId() == id){
                students.remove(student);
                return ResponseEntity.status(OK).body(String.format("Estudiante con id %d eliminado correctamente", id));
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(String.format("Estudiante con id %d no encontrado", id));
    }

    public ResponseEntity<String> updateStudentById(int id, StudentModel newStudent){
        for(int i = 0; i < this.students.size(); i++) {
            if(this.students.get(i).getId() == id){
                newStudent.setId(id);
                this.students.set(i, newStudent);
                return ResponseEntity.status(OK).body(String.format("Estudiante con id %d actualizado correctamente", id));
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(String.format("Estudiante con id %d no encontrado", id));
    }
}
