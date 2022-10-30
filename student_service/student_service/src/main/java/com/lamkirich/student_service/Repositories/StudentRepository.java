package com.lamkirich.student_service.Repositories;

import com.lamkirich.student_service.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {}

