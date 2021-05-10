package code;

public class Movie {
    /**
     * CHILDREN const.
     */
    public static final int CHILDREN = 2;
    /**
     * REGULAR const.
     */
    public static final int REGULAR = 0;
    /**
     * NEW_RELEASE const.
     */
    public static final int NEW_RELEASE = 1;
    /**
     * title : Title of the movie.
     */
    private final String title;
    /**
     * priceCode : Price of the film.
     */
    private int priceCode;

   public  Movie(final String newTitle, final int newPriceCode) {
        title = newTitle;
        priceCode = newPriceCode;
    }

    /**
     * Getter-Function.
     * @return priceCode : Price of code.Movie
     */
    public int getPriceCode() {
        return priceCode;
    }

    /**
     * Setter-Function.
     * @param arg Arg-Parameter
     */
    public void setPriceCode(final int arg) {
        priceCode = arg;
    }

    /**
     * Getter-Function.
     * @return title : Title of code.Movie
     */
    public String getTitle() {
        return title;
    }

}
