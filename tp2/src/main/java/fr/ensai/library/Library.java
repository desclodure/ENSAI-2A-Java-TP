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
        System.out.println("\n**********************************************");
        System.out.println("* All items                                  *");
        System.out.println("**********************************************");
        if (items.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }

    /**
     * Returns a list of books that are written by a specific author.
     *
     * @param author The author whose books are to be returned.
     * @return A list of books written by the specific author.
     */
    public ArrayList<Book> getBooksByAuthor(Author author) {
        ArrayList<Book> result = new ArrayList<>();
        for (Item item : items) {
            if (item instanceof Book) { // to check if the item is a Book
                Book book = (Book) item; // to cast the item to a Book
                if (book.getAuthor().equals(author)) {
                    result.add(book);
                }
            }
        }
        return result;
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