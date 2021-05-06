class Rental {
    /**
     * movie : Movie object.
     */
    private Movie movie;
    /**
     * daysRented : Time past of rental represented by an Integer.
     */
    private int daysRented;

    /**
     * Constructor for the Rental class with the two ...
     * @param newMovie : Movie of rental
     * @param newDaysRented : Time since the rental began
     */
    Rental(final Movie newMovie, final int newDaysRented) {
        movie = newMovie;
        daysRented = newDaysRented;
    }

    /**
     * Getter-Function.
     * @return daysRented : Get the days since the rental began.
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * Getter-Function.
     * @return movie : Get the movie that was rented.
     */
    public Movie getMovie() {
        return movie;
    }
}
