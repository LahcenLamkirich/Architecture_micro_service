package com.lamkirich.student_service.ValueObject;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Department {
    private Long departmentId ;
    private String departmentName ;
    private String departmentCode ;
}
