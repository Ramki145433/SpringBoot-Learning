package com.example.learningSpringBoot.Repository;
import com.example.learningSpringBoot.Entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
    public Employee getEmployee(Integer id) {
        //DB Operation fetch the details for DB
        return new Employee(id, "Ramki", "EEE", 27);
    }
}
