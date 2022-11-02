package com.example.restpractice1.practice1.controller;

import com.example.restpractice1.practice1.domain.Movie;
import com.example.restpractice1.practice1.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies/v1")
public class MovieController {

    private MovieServiceImpl  movieService;

    @Autowired
    public MovieController(MovieServiceImpl movieService){
        this.movieService = movieService;
    }

    @PostMapping(value = "/movie")
    public ResponseEntity<?> save(@RequestBody  Movie movie){
        Movie movie1 = movieService.add(movie);
        return new ResponseEntity<>(movie1, HttpStatus.CREATED);
    }
}
