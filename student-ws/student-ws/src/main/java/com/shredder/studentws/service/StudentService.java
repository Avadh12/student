package com.shredder.studentws.service;

import com.shredder.studentws.entity.StudentEntity;
import com.shredder.studentws.model.StudentCreateRequest;
import com.shredder.studentws.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void createUser(StudentCreateRequest request){

        if(request.getName().equals("")) throw new RuntimeException("hrfhrfhrf");

        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setName(request.getName());
        studentEntity.setDob(request.getDob());
        studentEntity.setStd(request.getStd());

        studentRepository.save(studentEntity);
    }

    public StudentEntity getUserByID (Long userID){

        Optional<StudentEntity> studentOptional = studentRepository.findById(userID);
        return studentOptional.orElseGet(StudentEntity::new);
    }



}
