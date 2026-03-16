package com.example.learningSpringBoot;

import com.example.learningSpringBoot.Entity.Person;
import com.example.learningSpringBoot.Repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Timestamp;
import java.util.Date;

@SpringBootApplication
public class LearningSpringBootApplication implements CommandLineRunner {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringBootApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        logger.info("All users -> {}", personRepository.findAll());
        logger.info("Find by id -> {}", personRepository.findById(10006));
        logger.info("Find by name -> {}", personRepository.findByName("Raj"));
        logger.info("Deleting teh id 10006 -> No of Deleted - {}", personRepository.deleteById(10006));
        logger.info("Inserting a new person object -> No of rows added - {}", personRepository.insert(new Person(10011, "Raju", "Nellore", new Date())));
        logger.info("Updating a new person object with id 10005-> No of rows added - {}", personRepository.insert(new Person(10005, "Ram", "Warangal", new Date())));
    }
}