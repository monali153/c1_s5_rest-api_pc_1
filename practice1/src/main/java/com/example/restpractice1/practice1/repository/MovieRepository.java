package com.example.restpractice1.practice1.repository;

import com.example.restpractice1.practice1.domain.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer> {
}
