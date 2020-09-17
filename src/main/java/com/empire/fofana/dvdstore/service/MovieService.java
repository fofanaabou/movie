package com.empire.fofana.dvdstore.service;

import com.empire.fofana.dvdstore.entity.Movie;
import com.empire.fofana.dvdstore.repository.MovieRepository;

public class MovieService {

    private MovieRepository movieRepository = new MovieRepository();

    public void registerMovie(Movie movie) {
        movieRepository.add(movie);

    }
}
