package tests;

import code.Movie;
import code.Rental;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    @Test
    public void getPriceCode() {
        Movie movie = new Movie("TestFilm", 1000);

        assert movie.getPriceCode() == 1000;
    }

    @Test
    public void setPriceCode() {
        Movie movie = new Movie("TestFilm", 1000);
        movie.setPriceCode(1001);

        assert movie.getPriceCode() == 1001;
    }

    @Test
    public void getTitle() {
        Movie movie = new Movie("TestFilm", 1000);

        assert movie.getTitle() == "TestFilm";
    }
}