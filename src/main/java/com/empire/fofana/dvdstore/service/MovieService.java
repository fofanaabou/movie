package com.empire.fofana.dvdstore.service;

import com.empire.fofana.dvdstore.entity.Movie;
import com.empire.fofana.dvdstore.repository.GoLiveMovieRepository;
import java.io.IOException;

public class MovieService {

    private GoLiveMovieRepository goLiveMovieRepository = new GoLiveMovieRepository();

    public void registerMovie(Movie movie) throws IOException {
        goLiveMovieRepository.add(movie);

    }
}
