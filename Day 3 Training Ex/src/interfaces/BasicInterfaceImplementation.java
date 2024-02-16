package interfaces;

interface LibraryItem {
    void borrow();
    void returnItem();
}

interface LibraryUser {
    // Define user-related methods
    void borrowItem(LibraryItem item);
    void returnItem(LibraryItem item);
}

class Book implements LibraryItem {
    // Implement methods for books
    String uid;

    public Book(String uid) {
        this.uid = uid;
    }

    @Override
    public void borrow() {
        System.out.println("Book with ID " + uid + " is borrowed by the member");
    }

    @Override
    public void returnItem() {
        System.out.println("Book with ID " + uid + " is returned by the member");
    }
}

class DVD implements LibraryItem {
    // Implement methods for DVDs
    String uid;

    public DVD(String uid) {
        this.uid = uid;
    }

    @Override
    public void borrow() {
        System.out.println("DVD with ID " + uid + " is borrowed by the member");
    }

    @Override
    public void returnItem() {
        System.out.println("DVD with ID " + uid + " is returned by the member");
    }
}

class LibraryMember implements LibraryUser {
    // Implement methods for library members
    String name;

    public LibraryMember(String name) {
        this.name = name;
    }

    @Override
    public void borrowItem(LibraryItem item) {
        item.borrow();
    }

    @Override
    public void returnItem(LibraryItem item) {
        item.returnItem();
    }
}


public class BasicInterfaceImplementation {
    public static void main(String[] args) {
        Book book = new Book("B101");
        DVD dvd = new DVD("D201");

        LibraryMember alice = new LibraryMember("Alice");
        alice.borrowItem(book);
    }
}

//Problem Statement 1: Basic Interface Implementation
//Implement a basic library system with interfaces LibraryItem and LibraryUser. The library items include books and DVDs, each having a unique identification number. Users should be able to borrow and return items.
//
//Requirements:
//Two interfaces: LibraryItem and LibraryUser
//Concrete classes: Book, DVD, and LibraryMember
//Overriding methods for borrowing and returning items
//
//Operations to Perform:
//Create instances of books and DVDs with unique IDs
//Implement borrow and return methods in LibraryMember
//Ensure dynamic method dispatch for handling different item types
//
//Sample Code Stub:
//interface LibraryItem {
//    void borrow();
//    void returnItem();
//}
//
//interface LibraryUser {
//    // Define user-related methods
//}
//
//class Book implements LibraryItem {
//    // Implement methods for books
//}
//
//class DVD implements LibraryItem {
//    // Implement methods for DVDs
//}
//
//class LibraryMember implements LibraryUser {
//    // Implement methods for library members
//}
//
//Sample Input:
//Create a book with ID 101
//Create a DVD with ID 201
//Library member 'Alice' borrowing the book
//Sample Output:
//Book with ID 101 is borrowed by Alice
