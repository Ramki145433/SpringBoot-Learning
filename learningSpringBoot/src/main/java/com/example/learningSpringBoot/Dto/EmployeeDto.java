package com.example.learningSpringBoot.Dto;

import com.example.learningSpringBoot.Entity.Employee;

public class EmployeeDto {
    Integer id;
    String name;
    String department;
    Integer age;

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

    public EmployeeDto EmployeeMapper(Employee employee) {
        this.setId(employee.getId());
        this.setName(employee.getName());
        this.setDepartment(employee.getDepartment());
        this.setAge(employee.getAge());
        return this;
    }
}
