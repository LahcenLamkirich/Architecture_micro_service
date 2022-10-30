package com.lamkirich.department_service;


import com.lamkirich.department_service.Entities.Department;
import com.lamkirich.department_service.Repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TpMicroserviceApplication {

    @Autowired
    DepartmentRepository departmentRepository ;
    public static void main(String[] args) {
        SpringApplication.run(TpMicroserviceApplication.class, args);
    }
    @Bean
    CommandLineRunner start() {
        return args -> {
            System.out.println("Hello From the department service ....");
            departmentRepository.save(new Department(1L, "First Department", "15487Dlk"));
            departmentRepository.save(new Department(2L, "Second Department", "458ERTD"));
            departmentRepository.save(new Department(3L, "Third Department", "3658WSX"));
        };
    }
}
