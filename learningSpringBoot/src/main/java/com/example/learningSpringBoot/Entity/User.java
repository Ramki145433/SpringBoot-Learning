package com.example.learningSpringBoot.Entity;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype") {Bean created for every request}
public class User {
    @Autowired
    Product product;

    public User() {
        System.out.println("User Constructor");
    }
    @PostConstruct
    public void userInit() {
        System.out.println("User Initiated " + this.hashCode());
    }
}
