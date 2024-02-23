package collections2;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.Set;
import java.util.Scanner;

class Book {
    // Book class definition with attributes like title, author, publication year, etc.
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return publicationYear+" - "+title+" by "+author;
    }
}


public class BookshelfManagement {
    public static void main(String[] args) {
        Set<Book> bookshelf = new TreeSet<>(Comparator.comparingInt(Book::getPublicationYear).reversed());
        Scanner scanner = new Scanner(System.in);

        // Implement operations here
        System.out.println("Add book");
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int publicationYear = scanner.nextInt();
        Book inputBook = new Book(title, author, publicationYear);
        bookshelf.add(inputBook);
        bookshelf.add(new Book("book1", "author1", 1973));
        bookshelf.add(new Book("book2", "author2", 1976));
        bookshelf.add(new Book("book3", "author3", 2000));
        System.out.println("Remove book");
        int eleToRemYear = scanner.nextInt();
        for(Book book: bookshelf){
            if(book.getPublicationYear()==eleToRemYear){
                bookshelf.remove(book);
                break;
            }
        }
        System.out.println("Display all books");
        for(Book book: bookshelf){
            System.out.println(book);
        }

        scanner.close();

    }
}

//Problem 8: Bookshelf Management
//Develop a Java program to manage a bookshelf using a collection.
//
//Requirements:
//Implement a program that allows users to add, remove, and display book objects based on their publication year.
//
//Operations to Perform:
//a. Add a book to the bookshelf.
//b. Remove a book based on its publication year.
//c. Display all books in descending order of their publication year.
//
//Code Stub:
//import java.util.TreeSet;
//import java.util.Set;
//import java.util.Scanner;
//
//class Book {
//    // Book class definition with attributes like title, author, publication year, etc.
//}
//
//public class BookshelfManagement {
//    public static void main(String[] args) {
//        Set<Book> bookshelf = new TreeSet<>(Comparator.comparingInt(Book::getPublicationYear).reversed());
//        Scanner scanner = new Scanner(System.in);
//
//        // Implement operations here
//
//        scanner.close();
//    }
//}
//Sample Input:
//1  // Add book
//The Great Gatsby
//F. Scott Fitzgerald
//1925
//2  // Remove book
//1930
//3  // Display all books
//
//Sample Output:
//Book added: The Great Gatsby by F. Scott Fitzgerald (Year: 1925)
//Book with publication year 1930 removed from the bookshelf.
//Books in descending order of publication year:
//1925 - The Great Gatsby by F. Scott Fitzgerald
//1922 - Ulysses by James Joyce
