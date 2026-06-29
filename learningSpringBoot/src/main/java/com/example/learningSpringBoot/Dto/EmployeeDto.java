package com.example.learningSpringBoot.Dto;

import com.example.learningSpringBoot.Entity.Employee;
import com.example.learningSpringBoot.ExceptionHandlers.PhoneNumber;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class EmployeeDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @NotBlank(message = "name is required")
    String name;
    @NotBlank(message = "department is required")
    String department;

    @Min(value = 18, message = "minimum age should be >= 18")
    @Max(value = 60, message = "maximum age should be <= 60")
    Integer age;

    @PhoneNumber
    String phoneNumber;

    public EmployeeDto() {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public EmployeeDto(Integer id, String name, String department, Integer age, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public EmployeeDto EmployeeMapper(Employee employee) {
        this.setId(employee.getId());
        this.setName(employee.getName());
        this.setDepartment(employee.getDepartment());
        this.setAge(employee.getAge());
        return this;
    }
}