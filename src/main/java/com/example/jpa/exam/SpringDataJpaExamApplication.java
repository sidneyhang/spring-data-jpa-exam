package com.example.jpa.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author sidney
 */
@EnableJpaAuditing
@EntityScan(basePackages = "com.example.jpa.exam.entity")
@EnableJpaRepositories(basePackages = "com.example.jpa.exam.repository")
@SpringBootApplication
public class SpringDataJpaExamApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaExamApplication.class, args);
    }

}
