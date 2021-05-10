package tests;

import code.Customer;
import code.Movie;
import code.Rental;
import org.junit.Test;

import static org.junit.Assert.*;

public class RentalTest {

    @Test
    public void getDaysRented() {
        Movie movie = new Movie("TestFilm", 1000);
        Rental rental = new Rental(movie, 0);

        assert rental.getDaysRented() == 0;
    }

    @Test
    public void getMovie() {
        Movie movie = new Movie("TestFilm", 1000);
        Rental rental = new Rental(movie, 0);

        assert rental.getMovie() == movie;
    }
}