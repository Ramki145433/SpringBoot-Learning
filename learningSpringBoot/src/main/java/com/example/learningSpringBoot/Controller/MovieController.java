package com.example.learningSpringBoot.Controller;

import com.example.learningSpringBoot.Service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    public MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }
    @GetMapping("/getMovieName")
    public void getMovie(){
        movieService.printMovies();
    }

}