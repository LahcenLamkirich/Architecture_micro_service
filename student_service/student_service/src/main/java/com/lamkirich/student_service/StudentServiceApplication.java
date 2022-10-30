package com.lamkirich.student_service;

import com.lamkirich.student_service.Entities.Student;
import com.lamkirich.student_service.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class StudentServiceApplication {
	@Autowired
	StudentRepository studentRepository ;

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start() {
		return args -> {
			System.out.println("Hello From the Student Service ....");
			studentRepository.save(new Student(1L,"Lahcen","Lamkirich","D12458992", 1L));
			studentRepository.save(new Student(2L, "Sami", "Lamkirich", "D458798434", 3L));
		};
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
