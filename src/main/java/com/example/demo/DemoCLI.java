package com.example.demo;

import com.example.demo.sample.Employee;
import com.example.demo.sample.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoCLI implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(DemoCLI.class);

    @Autowired
    private EmployeeRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.deleteAll();

        repository.save(new Employee("AAA", "CEO"));
        repository.save(new Employee("BBB", "Engineer"));
        repository.save(new Employee("CCC", "Engineer"));
        repository.save(new Employee("DDD", "Manager"));
        repository.save(new Employee("EEE", "CTO"));
        repository.save(new Employee("FFF", "CMO"));
        repository.save(new Employee("GGG", "QA"));
        repository.save(new Employee("HHH", "Business Analyst"));
        repository.save(new Employee("III", "Scrum Master"));
        repository.save(new Employee("JJJ", "Engineer"));
        repository.save(new Employee("KKK", "Engineer"));
        repository.save(new Employee("LLL", "Manager"));

        repository.findAll().forEach((city) -> {
            logger.info("{}", city);
        });
    }
}
