package code;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    /**
     * None magic THREE.
     */
    private static final int THREE = 3;
    /**
     * None magic TWO.
     */
    private static final int TWO = 2;
    /**
     * None magic ONE_FIVE.
     */
    private static final double ONE_FIVE = 1.5;
    /**
     * name : Name of code.Customer.
     */
    private final String name;
    /**
     * rentals : Vector of all rentals.
     */
    private final Vector<Rental> rentals = new Vector<>();

    public Customer(final String newName) {
        name = newName;
    }

    public void addRental(final Rental arg) {
        rentals.addElement(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration<Rental> enumRentals = rentals.elements();
        String result = "Rental Record for " + this.getName() + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

        while (enumRentals.hasMoreElements()) {
            Rental each = enumRentals.nextElement();
            //determine amounts for each line
            double thisAmount = amountFor(each);
            // add frequent renter points
            frequentRenterPoints++;
            // add bonus for a two day new release rental
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1) {
                frequentRenterPoints++;
            }
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + "\t" + each.getDaysRented() + "\t" + thisAmount + "\n";
            totalAmount += thisAmount;
        }
        //add footer lines
        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter points";
        return result;
    }

    private double amountFor(final Rental each) {
        double thisAmount;
        switch (each.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                thisAmount = TWO;
                if (each.getDaysRented() > TWO) {
                    thisAmount += (each.getDaysRented() - TWO) * ONE_FIVE;
                }
                break;
            case Movie.NEW_RELEASE:
                thisAmount = each.getDaysRented() * THREE;
                break;
            case Movie.CHILDREN:
                thisAmount = ONE_FIVE;
                if (each.getDaysRented() > THREE) {
                    thisAmount += (each.getDaysRented() - THREE) * ONE_FIVE;
                }
                break;
            default:
                thisAmount = 0;
        }
        return thisAmount;
    }
}
