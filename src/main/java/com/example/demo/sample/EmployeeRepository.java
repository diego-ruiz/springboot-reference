package com.example.demo.sample;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query(value = "select * from Employee where role ILIKE 'engineer'", nativeQuery = true)
    public List<Employee> getEngineers();
}
