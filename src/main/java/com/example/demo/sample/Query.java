package com.example.demo.sample;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import java.util.List;

public class Query implements GraphQLQueryResolver {
    private EmployeeRepository employeeRepository;

    public Query(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployees(int count, int offset) {
        return employeeRepository.findAll();
    }

    public String hello() {
        return "Hello, GraphQL!";
    }
}

