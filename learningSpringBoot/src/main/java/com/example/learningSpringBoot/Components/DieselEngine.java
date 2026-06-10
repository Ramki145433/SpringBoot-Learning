package com.example.learningSpringBoot.Components;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DieselEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Diesel Engine");
    }
}
