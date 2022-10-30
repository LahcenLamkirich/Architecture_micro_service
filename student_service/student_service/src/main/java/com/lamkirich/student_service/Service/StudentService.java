package com.lamkirich.student_service.Service;

import com.lamkirich.student_service.Entities.Student;
import com.lamkirich.student_service.Repositories.StudentRepository;
import com.lamkirich.student_service.ValueObject.Department;
import com.lamkirich.student_service.ValueObject.ResponseTemplateValueObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository ;
    @Autowired
    RestTemplate restTemplate ;
    public Student addStudent(Student student){
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }

    public Student getStudentById(Long id){
        return studentRepository.findById(id).get();
    }

    public ResponseTemplateValueObject getStudentWithDepartment(Long id){
        ResponseTemplateValueObject responseTemplateValueObject = new ResponseTemplateValueObject();
        Student student = studentRepository.findById(id).get();
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+student.getDepartmentId(), Department.class);

        responseTemplateValueObject.setStudent(student);
        responseTemplateValueObject.setDepartment(department);

        return responseTemplateValueObject;
    }

}
