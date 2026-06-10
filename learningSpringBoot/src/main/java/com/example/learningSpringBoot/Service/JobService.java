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
        job.setCreatedDate(LocalDateTime.now());

        Job saved = jobRepository.save(job);

        JobResponseDto response = new JobResponseDto();

        response.setId(saved.getId());
        response.setTitle(saved.getTitle());
        response.setDescription(saved.getDescription());
        response.setLocation(saved.getLocation());

        return response;
    }

    // GET ALL
    public List<Job> findAllJobs() {
        return jobRepository.findAll();
    }

    // GET BY ID
    public Job findById(Long id) {

        Optional<Job> optional = jobRepository.findById(id);

        return optional.orElse(null);
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