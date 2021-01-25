package com.example.demo.sample;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

    public Page<Employee> getEmployeesPageable(int page, int size){
        Pageable firstPageWithTwoElements = PageRequest.of(page, size);
        return repository.findAll(firstPageWithTwoElements);
    }

    public Employee save(Employee employee){
        return repository.save(employee);
    }

}
