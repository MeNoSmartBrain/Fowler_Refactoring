package tests;

import code.Customer;
import code.Movie;
import code.Rental;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

public class CustomerTest {

    @org.junit.Test
    public void getName() {
        Customer customer = new Customer("TestNutzer");
        Movie movie = new Movie("TestFilm", 1000);
        Rental rental = new Rental(movie, 0);
        customer.addRental(rental);

        assert customer.getName() == "TestFilm";
    }

    @org.junit.Test
    public void statement() {
        Customer customer = new Customer("TestNutzer");
        Movie movie = new Movie("TestFilm", 1000);
        Rental rental = new Rental(movie, 0);
        customer.addRental(rental);

        assert !customer.statement().isEmpty();
    }
}