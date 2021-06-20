package com.shredder.studentws.service;

import com.shredder.studentws.entity.StudentEntity;
import com.shredder.studentws.model.StudentCreateRequest;
import com.shredder.studentws.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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
    public StudentEntity getStudentByName(String Name) {

        Optional<StudentEntity> studentOptional = studentRepository.findByName(Name);
        return studentOptional.orElseGet(StudentEntity::new);
    }
    public List<StudentEntity> getAll()
    {
        List<StudentEntity>student   = new ArrayList<StudentEntity>();
        studentRepository.findAll().forEach(student2 -> student.add(student2));
        return student;
    }

    public void deleteByID (Long userID){
        studentRepository.deleteById(userID);
        }


    public void deleteAll (){
        studentRepository.deleteAll();
    }

    public void update(StudentEntity std1,Long userID ){
        Optional<StudentEntity> studentOptional = studentRepository.findById(userID);
        StudentEntity std2=studentOptional.orElseGet(StudentEntity::new);

        std2.setId(std1.getId());
        std2.setName(std1.getName());
        std2.setDob(std1.getDob());
        std2.setStd(std1.getStd());
        studentRepository.save(std2);

    }
}
