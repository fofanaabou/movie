package com.empire.fofana.dvdstore;

import com.empire.fofana.dvdstore.entity.Movie;
import com.empire.fofana.dvdstore.service.MovieService;
import controller.MovieController;

import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        MovieController movieController = new MovieController();
        movieController.addUsingConsole();

    }
}
