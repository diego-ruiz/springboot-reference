package com.example.demo;

import com.example.demo.sample.EmployeeRepository;
import com.example.demo.sample.Query;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphqlConfiguration {
    @Bean
    public Query query(EmployeeRepository employeeRepository) {
        return new Query(employeeRepository);
    }
}
