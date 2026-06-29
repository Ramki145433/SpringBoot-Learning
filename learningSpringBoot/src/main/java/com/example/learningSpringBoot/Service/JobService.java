package com.example.learningSpringBoot.Service;

import com.example.learningSpringBoot.Dto.CreateJobRequestDto;
import com.example.learningSpringBoot.Dto.JobResponseDto;
import com.example.learningSpringBoot.Entity.Job;
import com.example.learningSpringBoot.Repository.JobRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    // CREATE
    public JobResponseDto createJob(CreateJobRequestDto dto) {

        Job job = new Job();

        job.setTitle(dto.getTitle());
        job.setDescription(dto.getDescription());
        job.setMinSalary(dto.getMinSalary());
        job.setMaxSalary(dto.getMaxSalary());
        job.setLocation(dto.getLocation());
        job.setCompany(dto.getCompany());
        job.setExperience(dto.getExperience());
        job.setCreatedDate(LocalDateTime.now());

        Job saved = jobRepository.save(job);

        JobResponseDto response = new JobResponseDto();

        response.setId(saved.getId());
        response.setTitle(saved.getTitle());
        response.setDescription(saved.getDescription());
        response.setLocation(saved.getLocation());
        response.setCompany(saved.getCompany());
        response.setExperience(saved.getExperience());

        return response;
    }

    // GET ALL
    public List<JobResponseDto> searchJobs(
            String location,
            String company,
            Integer experience) {

        List<Job> jobs;

        if (location == null &&
                company == null &&
                experience == null) {

            jobs = jobRepository.findAll();

        } else if (location != null &&
                company == null &&
                experience == null) {

            jobs = jobRepository.findByLocation(location);

        } else if (location == null &&
                company != null &&
                experience == null) {

            jobs = jobRepository.findByCompany(company);

        } else if (location == null &&
                company == null &&
                experience != null) {

            jobs = jobRepository.findByExperience(experience);

        } else if (location != null &&
                company != null &&
                experience == null) {

            jobs = jobRepository.findByLocationAndCompany(
                    location,
                    company);

        } else if (location != null &&
                company == null &&
                experience != null) {

            jobs = jobRepository.findByLocationAndExperience(
                    location,
                    experience);

        } else if (location == null &&
                company != null &&
                experience != null) {

            jobs = jobRepository.findByCompanyAndExperience(
                    company,
                    experience);

        } else {
            jobs = jobRepository.findByLocationAndCompanyAndExperience(
                            location,
                            company,
                            experience);
        }

        return jobs.stream().map(job -> {

            JobResponseDto dto = new JobResponseDto();

            dto.setId(job.getId());
            dto.setTitle(job.getTitle());
            dto.setLocation(job.getLocation());
            dto.setExperience(job.getExperience());
            dto.setCompany(job.getCompany());
            dto.setDescription(job.getDescription());

            return dto;

        }).toList();
    }

    // GET BY ID
    // In your JobService interface/implementation:
    public Optional<Job> findById(Long id) {
        return jobRepository.findById(id); // Spring Data JPA repositories return Optional by default
    }


    // DELETE
    public boolean deleteById(Long id) {

        if (jobRepository.existsById(id)) {

            jobRepository.deleteById(id);
            return true;
        }

        return false;
    }

    // UPDATE
    public boolean updateJob(Long id, Job updatedJob) {

        Optional<Job> optional = jobRepository.findById(id);

        if (optional.isPresent()) {

            Job existingJob = optional.get();

            existingJob.setTitle(updatedJob.getTitle());
            existingJob.setDescription(updatedJob.getDescription());
            existingJob.setMinSalary(updatedJob.getMinSalary());
            existingJob.setMaxSalary(updatedJob.getMaxSalary());
            existingJob.setLocation(updatedJob.getLocation());

            jobRepository.save(existingJob);

            return true;
        }

        return false;
    }
}