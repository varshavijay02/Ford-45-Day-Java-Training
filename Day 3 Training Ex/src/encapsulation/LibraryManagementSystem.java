package encapsulation;

class Book {
    private String title;
    private String author;
    private String ISBN;

    // Constructor and methods for getting book details

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle(){
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Book: " + title +
                ", author: " + author +
                ", ISBN: " + ISBN;
    }
}

class Library {
    private Book[] books;
    private static int length = 0;

    private int maxLength;

    // Constructor and methods for adding books, displaying all books, and finding by ISBN
    public Library(int maxLength){
        this.maxLength = maxLength;
        books = new Book[maxLength];
    }

    void addBook(Book book){
        if(length<maxLength) books[length++] = book;
        else System.out.println("Only "+maxLength+" Book Allowed!");
    }

    Book findBookByISBN(String ISBN){
        for(Book book : books){
            if(book.getISBN().equals(ISBN)){
                return book;
            }
        }
        return null;
    }

    void displayBooks(){
        for(Book book: books){
            if(book!=null) System.out.println(book);
        }
    }
}


public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Sample Usage
        Library library = new Library(10); // Assume the library can store up to 10 books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780141182636");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0061120081");

        library.addBook(book1);
        library.addBook(book2);
        library.displayBooks();
        Book foundBook = library.findBookByISBN("0061120081");
        System.out.println("Found Book: " + foundBook.getTitle());


    }
}

//Problem 5: Library Management System
//
//Create a Book class encapsulating book details such as title, author, and ISBN. Design a Library class that maintains an array of Book objects. Implement methods to add books, display all books, and find a book by its ISBN.
//
//Requirements:
//
//The Book class should have private fields for title, author, and ISBN.
//The Library class should have a private array to store Book objects.
//Implement methods in the Library class to add books, display all books, and find a book by its ISBN.
//
//Sample Code Stub:
//
//public class Book {
//    private String title;
//    private String author;
//    private String ISBN;
//
//    // Constructor and methods for getting book details
//}
//
//public class Library {
//    private Book[] books;
//
//    // Constructor and methods for adding books, displaying all books, and finding by ISBN
//}
//
//// Sample Usage
//Library library = new Library(10); // Assume the library can store up to 10 books
//Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780141182636");
//Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0061120081");
//
//library.addBook(book1);
//library.addBook(book2);
//library.displayBooks();
//Book foundBook = library.findBookByISBN("0061120081");
//System.out.println("Found Book: " + foundBook.getTitle());
//
//
//
//Sample output:
//
//// Displaying all books in the library
//library.displayBooks();
//
//// Output:
//// Book: The Great Gatsby, Author: F. Scott Fitzgerald, ISBN: 9780141182636
//// Book: To Kill a Mockingbird, Author: Harper Lee, ISBN: 0061120081
//// Book: 1984, Author: George Orwell, ISBN: 9780451524935
//// Book: The Catcher in the Rye, Author: J.D. Salinger, ISBN: 9780241950425
//
//// Finding a book by ISBN
//Book foundBook = library.findBookByISBN("9780451524935");
//System.out.println("Found Book: " + foundBook.getTitle());
//
//// Output: Found Book: 1984
