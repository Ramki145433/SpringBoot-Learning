package com.example.learningSpringBoot.Repository;

import com.example.learningSpringBoot.Entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
    List<Job> findByLocation (String location);
    List<Job> findByCompany(String company);

    List<Job> findByExperience(Integer experience);

    List<Job> findByLocationAndCompany(
            String location,
            String company);

    List<Job> findByLocationAndExperience(
            String location,
            Integer experience);

    List<Job> findByCompanyAndExperience(
            String company,
            Integer experience);

    List<Job> findByLocationAndCompanyAndExperience(
            String location,
            String company,
            Integer experience);
}