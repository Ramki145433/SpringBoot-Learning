package com.example.learningSpringBoot.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class HistoricalMovieRepository implements MovieRepository{

    @Override
    public String movieName() {
        return "Ramayana";
    }
}
