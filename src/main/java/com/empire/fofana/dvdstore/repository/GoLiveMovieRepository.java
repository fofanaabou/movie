package com.empire.fofana.dvdstore.repository;

import com.empire.fofana.dvdstore.entity.Movie;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.util.logging.Logger;

public class GoLiveMovieRepository   {

    private Logger logger = Logger.getLogger(GoLiveMovieRepository.class.getName());
    public void add(Movie movie)  throws IOException {

        String str =  movie.getTitle() + "," + movie.genre;
        FileWriter file =
                new FileWriter(
                        "C:\\Users\\aboub\\OneDrive\\Bureau\\Dev\\workspace\\movies\\data\\movies.txt",
                        true);
        try (BufferedWriter writer = new BufferedWriter(file)) {
            writer.append(str);
            writer.newLine();
        }

        logger.info("The movie "+movie.getTitle()+" has been added.");
    }
}
