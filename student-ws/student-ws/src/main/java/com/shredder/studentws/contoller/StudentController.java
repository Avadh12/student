package com.shredder.studentws.contoller;


import com.shredder.studentws.entity.StudentEntity;
import com.shredder.studentws.model.StudentCreateRequest;
import com.shredder.studentws.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
//    SOLID
    @Autowired
    StudentService studentService;


    @PostMapping("/api/v1/student")
    public ResponseEntity<String> createStudent(@RequestBody StudentCreateRequest studentCreateRequest){

        studentService.createUser(studentCreateRequest);

        return ResponseEntity.ok("Created");
    }

    @GetMapping("/api/v1/student/{userid}")
    public ResponseEntity<StudentEntity> getStudentById(@PathVariable Long userid){

        return ResponseEntity.ok(studentService.getUserByID(userid));
    }

}
