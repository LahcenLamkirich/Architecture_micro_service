package com.lamkirich.department_service.Controller;

import com.lamkirich.department_service.Entities.Department;
import com.lamkirich.department_service.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    DepartmentService depService ;

    @PostMapping("/save")
    public Department saveDepartment(@RequestBody Department department){
        return depService.saveDepartment(department);
    }

    @GetMapping
    public List<Department> getAllDepartments(){
        return depService.getAllDepartments();
    }

    @DeleteMapping(value = "/{id}")
    public void deleteDepartment(@PathVariable Long id){
        depService.deleteDepartment(id);
    }

    @GetMapping("/{id}")
    public Department getDepById(@PathVariable Long id){
        return depService.getDepartmentById(id);
    }
}
