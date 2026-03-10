package fr.ensai.library;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Library
 */

public class Library {
    
    // -------------------------------------------------------
    // Attributes
    // -------------------------------------------------------
    private String String name;
    private List<Item> items;
    private List<Loan> activeLoans;
    private List<Loan> completedLoans;

    // -------------------------------------------------------
    // Constructor
    // -------------------------------------------------------
    public Library(String name) {
        this.name = name;
        this.items = new ArrayList<>();
        this.activeLoans = new ArrayList<>();
        this.completedLoans = new ArrayList<>();
    }


    // -------------------------------------------------------
    // Methods
    // -------------------------------------------------------

    // Method for adding a book to the collection of the library
    public void addItem(Item item) {
        items.add(item);
    }

    public List<Loan> getActiveLoans() {
        return activeLoans;
    }
    
    /**
     * Displays all the items that are currently available in the library
     */
    public void displayItems() {
        this.attribute2 += increment;
    }
    
    /**
     * Checks if attribute2 is odd.
     *
     * @return true if attribute2 is odd, false otherwise.
     */
    public boolean isAttribute2Odd() {
        return attribute2 % 2 != 0;
    }


    /**
     * Main method
     */
    public static void main(String[] args) {

        ClassName c = new ClassName("", 0);
        c.increment_attribute2(5);
        System.out.println(c.isAttribute2Odd());
    }
}