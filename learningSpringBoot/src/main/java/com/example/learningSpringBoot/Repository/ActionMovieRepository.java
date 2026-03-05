package com.example.learningSpringBoot.Repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class ActionMovieRepository implements MovieRepository{
    @Override
    public String movieName() {
        return "Avengers";
    }
}
