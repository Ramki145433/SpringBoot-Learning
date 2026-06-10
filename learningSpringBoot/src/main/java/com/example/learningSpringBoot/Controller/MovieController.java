package com.example.learningSpringBoot.Controller;

import com.example.learningSpringBoot.Entity.User;
import com.example.learningSpringBoot.Service.MovieService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    User user;

    public MovieController() {
        System.out.println("movies constructor");
    }

    @PostConstruct
    public void sportsInit() {
        System.out.println("movies controller initiated " + this.hashCode() + "user hashcode " + user.hashCode());
    }
//    public MovieService movieService;
//
//    public MovieController(MovieService movieService) {
//        this.movieService = movieService;
//    }
//    @GetMapping("/getMovieName")
//    public void getMovie(){
//        movieService.printMovies();
//    }

}