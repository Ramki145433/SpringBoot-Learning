package com.example.learningSpringBoot.Service;

import com.example.learningSpringBoot.Dto.EmployeeDto;
import com.example.learningSpringBoot.Entity.Employee;
import com.example.learningSpringBoot.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    EmployeeRepository employeeRepository;
    // constructor injection
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeDto getEmployee(Integer id) {
        Employee employee = employeeRepository.getEmployee(id);
        EmployeeDto employeeDto = new EmployeeDto();
        return employeeDto.EmployeeMapper(employee);
    }
}
