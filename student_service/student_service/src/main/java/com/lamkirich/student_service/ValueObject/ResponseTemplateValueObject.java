package com.lamkirich.student_service.ValueObject;

import com.lamkirich.student_service.Entities.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ResponseTemplateValueObject {
    private Student student ;
    private Department department ;
}
