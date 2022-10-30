package com.lamkirich.student_service.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId ;
    private String firstName ;
    private String lastName ;
    private String CNE;
    private Long departmentId ;
}
