package com.example.learningSpringBoot.Controller;

import com.example.learningSpringBoot.Dto.EmployeeDto;
import com.example.learningSpringBoot.Service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getEmployee(@PathVariable Integer id) {
        EmployeeDto employee = employeeService.getEmployee(id);
        return ResponseEntity.ok(employee);
    }

    @PostMapping
    public ResponseEntity<String> createEmployee(@Valid @RequestBody EmployeeDto employeeDto) {
        return ResponseEntity.ok("Employee created successfully!!");
    }
}
