package com.example.learningSpringBoot.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class ComedyMovieRepository implements MovieRepository{
    @Override
    public String movieName() {
        return "Little Hearts";
    }
}
