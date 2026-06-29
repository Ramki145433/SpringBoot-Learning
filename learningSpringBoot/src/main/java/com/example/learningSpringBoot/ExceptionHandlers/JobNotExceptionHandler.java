package com.example.learningSpringBoot.ExceptionHandlers;

import com.example.learningSpringBoot.Dto.ErrorResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.time.LocalDateTime;

@RestControllerAdvice
public class JobNotExceptionHandler {
    @ExceptionHandler(JobNotFoundException.class)
    public ResponseEntity<?> handleJobNotException(JobNotFoundException exception) {
        ErrorResponseDto jobIdNotFound = new ErrorResponseDto(LocalDateTime.now(), exception.getMessage(), "Job id not found");
        return new ResponseEntity<>(jobIdNotFound, HttpStatus.NOT_FOUND);
    }
}
