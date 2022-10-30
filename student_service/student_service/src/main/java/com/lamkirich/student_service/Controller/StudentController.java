package com.lamkirich.student_service.Controller;


import com.lamkirich.student_service.Entities.Student;
import com.lamkirich.student_service.Service.StudentService;
import com.lamkirich.student_service.ValueObject.ResponseTemplateValueObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@Slf4j
public class StudentController {
    @Autowired
    StudentService studentService ;

    @GetMapping
    public List<Student> getAllStudents(){
        log.info("Getting all the students ...");
        return studentService.getAllStudents();
    }

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student){
        log.info("Saving a new Student ...");
        return studentService.addStudent(student);
    }

    @GetMapping("/{id}")
    public ResponseTemplateValueObject getStudentWithDepartmentById(@PathVariable Long id){
        log.info("Getting Student with department by Id ...");
        return studentService.getStudentWithDepartment(id);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable Long id){
        log.info("Deleting Student By Id ...");
        studentService.deleteStudent(id);
    }
    
}
