package week5.LibrarySystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    class Book {
        private String title;
        private String author;
        private double price;

        public Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public void displayBookDetails() {
            System.out.println("\n--- Book Details ---");
            System.out.println("Title  : " + title);
            System.out.println("Author : " + author);
            System.out.println("Price  : ₹" + price);
        }
    }

    private List<Book> books = new ArrayList<>();

    public void addBook() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter Book Title:");
        String title = sc.nextLine();

        System.out.println("Enter Author Name:");
        String author = sc.nextLine();

        System.out.println("Enter Book Price:");
        double price = sc.nextDouble();
        sc.nextLine();

        Book newBook = new Book(title, author, price);
        books.add(newBook);

        System.out.println("\n✅ Book added successfully!");
        newBook.displayBookDetails();
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("\nNo books available in the library!");
            return;
        }

        System.out.println("\n===== Library Book List =====");
        for (Book b : books) {
            b.displayBookDetails();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    library.addBook();
                    break;
                case 2:
                    library.displayAllBooks();
                    break;
                case 3:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 3);

        sc.close();
    }
}
