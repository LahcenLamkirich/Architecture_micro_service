package com.lamkirich.department_service.Service;


import com.lamkirich.department_service.Entities.Department;
import com.lamkirich.department_service.Repositories.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository ;

    public Department saveDepartment(Department department){
        log.info("Saving a new Department ....");
        return departmentRepository.save(department);
    }

    public List<Department> getAllDepartments(){
        log.info("Get All the departments ...");
        return departmentRepository.findAll();
    }

    public void deleteDepartment(Long id){
        log.info("Delete department !");
        departmentRepository.deleteById(id);
    }

    public Department getDepartmentById(Long id){
        log.info("Get department By Id ");
        return departmentRepository.findById(id).get();
    }
}