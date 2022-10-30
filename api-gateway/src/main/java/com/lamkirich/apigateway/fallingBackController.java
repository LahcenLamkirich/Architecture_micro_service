package com.lamkirich.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class fallingBackController {

    @GetMapping("/StudentServiceFalling")
    public String StudentServiceFalling(){
        return "Student Service is Down Currently !!";
    }


    @GetMapping("/DepartmentServiceFalling")
    public String DepartmentServiceFalling(){
        return "Department Service is Down Currently !!";
    }

}
