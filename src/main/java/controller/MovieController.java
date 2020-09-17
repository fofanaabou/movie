package controller;

import com.empire.fofana.dvdstore.entity.Movie;
import com.empire.fofana.dvdstore.service.MovieService;

import java.io.IOException;
import java.util.Scanner;

public class MovieController {

    private MovieService movieService;

    public void addUsingConsole() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Quel est le titre du film ? :" );
        String titleFilm = scanner.nextLine();
        System.out.println( "Quel est le genre du film ? :" );
        String genreFilm = scanner.nextLine();

        // create a movie
        Movie movie = new Movie();

        movie.setTitle(titleFilm);
        movie.setGenre(genreFilm);

        // register movie
        movieService = new MovieService();

        movieService.registerMovie(movie);

        System.out.println("New movie added: " + movie.getTitle());
    }
}
