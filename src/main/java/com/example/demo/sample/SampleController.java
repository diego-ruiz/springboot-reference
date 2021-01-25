package com.example.demo.sample;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SampleController {

    private final EmployeeService employeeService;

    SampleController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    List<Employee> all() {
        return employeeService.getEmployees();
    }

    @GetMapping("/employees/pageable")
    Page<Employee> employees(@RequestParam int page, @RequestParam int size){
        return employeeService.getEmployeesPageable(page, size);
    }

    @GetMapping("/engineers")
    List<Employee> allEngineers() {
        return employeeService.getEngineers();
    }

    @PostMapping("/employees")
    Employee newEmployee(@RequestBody Employee newEmployee) {
        return employeeService.save(newEmployee);
    }

    @GetMapping("/test")
    String returnTest() {
        return "hellossss";
    }
}
