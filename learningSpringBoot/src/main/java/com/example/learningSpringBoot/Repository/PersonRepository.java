package com.example.learningSpringBoot.Repository;

import com.example.learningSpringBoot.Entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public class PersonRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Person> findAll() {
        return jdbcTemplate.query("Select * from person", new BeanPropertyRowMapper<>(Person.class));
    }

    public Person findById(int id) {
        return jdbcTemplate.queryForObject("select * from person where id = ?", new Object[] {id},
                new BeanPropertyRowMapper<>(Person.class)
                );
    }

    public List<Person> findByName(String name) {
        return jdbcTemplate.query("select * from person where name = ?", new Object[] {name},
                new BeanPropertyRowMapper<>(Person.class)
        );
    }

    public int deleteById(int id) {
        return jdbcTemplate.update("Delete from person where id = ?", new Object[] {id});
    }

    public int insert(Person person) {
        return jdbcTemplate.update("INSERT INTO PERSON (ID, NAME, LOCATION, DATEOFBIRTH) VALUES (?, ?, ?, ?);",
                new Object[] {person.getId(), person.getName(), person.getLocation(), new Date(person.getDateOfBirth().getTime())});
    }

    // UPDATE PERSON SET (NAME = ?, LOCATION = ?, DATEOFBIRTH = ?) WHERE ID = ?
    public int update(Person person) {
        return jdbcTemplate.update("UPDATE PERSON SET (NAME = ?, LOCATION = ?, DATEOFBIRTH = ?) WHERE ID = ?",
                new Object[] {person.getName(), person.getLocation(), new Date(person.getDateOfBirth().getTime())}, person.getId());
    }
}
