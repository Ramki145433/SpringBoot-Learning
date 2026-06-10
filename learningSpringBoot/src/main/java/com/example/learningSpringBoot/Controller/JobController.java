package com.example.learningSpringBoot.Controller;

import com.example.learningSpringBoot.Dto.CreateJobRequestDto;
import com.example.learningSpringBoot.Dto.JobResponseDto;
import com.example.learningSpringBoot.Entity.Job;
import com.example.learningSpringBoot.Service.JobService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    // CREATE
    @PostMapping
    public ResponseEntity<JobResponseDto> createJob(
            @RequestBody CreateJobRequestDto dto) {

        JobResponseDto response = jobService.createJob(dto);

        return ResponseEntity
                .created(URI.create("/jobs/" + response.getId()))
                .body(response);
    }

    // GET ALL
    @GetMapping
    public ResponseEntity<List<Job>> findAll() {

        return ResponseEntity.ok(jobService.findAllJobs());
    }

    // GET BY ID
    @GetMapping("/{id}")
    public ResponseEntity<Job> findById(
            @PathVariable Long id) {

        Job job = jobService.findById(id);

        if (job != null) {
            return ResponseEntity.ok(job);
        }

        return ResponseEntity.notFound().build();
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(
            @PathVariable Long id) {

        boolean deleted = jobService.deleteById(id);

        if (deleted) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<String> updateById(
            @PathVariable Long id,
            @RequestBody Job job) {

        boolean updated = jobService.updateJob(id, job);

        if (updated) {
            return ResponseEntity.ok("Job updated successfully");
        }

        return ResponseEntity.notFound().build();
    }
}