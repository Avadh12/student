package com.shredder.studentws.repository;

import com.shredder.studentws.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, Long> {



//    void delete(StudentEntity deleted);
//
  List<StudentEntity> findAll();

//    Optional<StudentEntity> findOne(String name);
    Optional<StudentEntity> findByName(String name);

//    StudentEntity save(StudentEntity persisted);
   // Optional<StudentEntity> deleteById(Long ID);


}
