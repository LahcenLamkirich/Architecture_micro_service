package com.lamkirich.department_service.ValueObject;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    private Long userId ;
    private String firstName ;
    private String lastName ;
    private String CNE;
    private Long departmentId ;
}
