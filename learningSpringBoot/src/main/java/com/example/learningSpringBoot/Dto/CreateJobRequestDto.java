package com.example.learningSpringBoot.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class CreateJobRequestDto {
    @NotBlank(message = "title is required")
    private String title;
    @NotBlank(message = "description is required")
    private String description;
    @Positive(message = "maxSalary should be positive value")
    private String maxSalary;
    @Positive(message = "minSalary should be positive value")
    private String minSalary;
    @NotBlank(message = "location should not be null")
    private String location;
    @NotBlank(message = "company is required")
    private String company;
    @Positive(message = "experience should be positive value")
    private Integer experience;

    public CreateJobRequestDto(String title, String description, String maxSalary, String minSalary, String location, String company, Integer experience) {
        this.title = title;
        this.description = description;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
        this.location = location;
        this.company = company;
        this.experience = experience;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(String maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(String minSalary) {
        this.minSalary = minSalary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }
}
