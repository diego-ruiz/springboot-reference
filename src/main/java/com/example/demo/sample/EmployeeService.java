package com.example.demo.sample;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository repository;

    EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Employee> getEmployees(){
        return repository.findAll();
    }

    public List<Employee> getEngineers(){
        return repository.getEngineers();
    }

    public Employee save(Employee employee){
        return repository.save(employee);
    }

}
