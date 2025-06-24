package JavaConstructor;

public class Book {
    String title;
    String author;
    double price;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        System.out.println("Default Book constructor called.");
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Parameterized Book constructor called.");
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        // Create a book using the default constructor
        Book book1 = new Book();
        book1.displayBookDetails();
        System.out.println("\n");

        // Create a book using the parameterized constructor
        Book book2 = new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 12.99);
        book2.displayBookDetails();
    }
}