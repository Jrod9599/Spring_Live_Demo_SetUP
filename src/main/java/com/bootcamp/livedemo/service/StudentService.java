package com.bootcamp.livedemo.service;

import com.bootcamp.livedemo.model.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentService {

    private List<Student> studentsList = new ArrayList<>();

    public StudentService(){
            studentsList.add(new Student("Shahar", 26));
            studentsList.add(new Student("Victor", 25));
            studentsList.add(new Student("Tawni", 24));
            studentsList.add(new Student("Noelle", 24));
            studentsList.add(new Student("Mariano",28));

    }

    public List<Student> getStudentsList(){
        return studentsList;
    }

}
