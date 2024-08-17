package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student miriam = new Student(
                    "Miriam Masel",
                    "miriam.masel@gmail.com",
                    LocalDate.of(2000, Month.FEBRUARY, 12)
            );
            Student alex = new Student(
                    "ALex Kinuthia",
                    "alexk@gmail.com",
                    LocalDate.of(2004, Month.SEPTEMBER, 21)

            );

            repository.saveAll(List.of(miriam, alex));
        };
    }
}
