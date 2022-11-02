package com.example.restpractice1.practice1.service;

import com.example.restpractice1.practice1.domain.Movie;
import com.example.restpractice1.practice1.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService{

    private MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie add(Movie movie) {
        return movieRepository.save(movie);
    }
}
