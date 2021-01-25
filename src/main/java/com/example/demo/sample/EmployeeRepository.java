package com.example.demo.sample;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query(value = "select * from Employee where role ILIKE 'engineer'", nativeQuery = true)
    public List<Employee> getEngineers();

    //findAllPageable(Pageable pageable);
}
