package com.example.demo.sample;

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
