package com.lamkirich.department_service.ValueObject;

import com.lamkirich.department_service.Entities.Department;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ResponseTemplateValueObject {
    private Student student;
    private Department department;
}
