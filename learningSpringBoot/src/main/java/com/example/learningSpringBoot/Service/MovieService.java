package com.example.learningSpringBoot.Service;

import com.example.learningSpringBoot.Repository.ComedyMovieRepository;
import com.example.learningSpringBoot.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
//    private final MovieRepository movieRepository;
//
//    public MovieService(@Qualifier("comedyMovieRepository") MovieRepository movieRepository) {
//        this.movieRepository = movieRepository;
//    }
//
//    public String getMovie() {
//        return movieRepository.movieName();
//    }

    private final List<MovieRepository> movieRepositories;

    public MovieService(List<MovieRepository> movieRepositories) {
        this.movieRepositories = movieRepositories;
    }

    public void printMovies() {
        for(MovieRepository repo : movieRepositories) {
            System.out.println(repo.movieName());
        }
    }
}