package inheritance;

class Product {
    String productName;
    double price;
    String description;

    Product(String productName, double price, String description) {
        this.productName = productName;
        this.price = price;
        this.description = description;
    }
}

class Electronics extends Product {
    // Specific features for electronics products
    // Implementation...
    String model;
    Electronics(String productName, double price, String description, String model) {
        super(productName, price, description);
        this.model = model;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "model='" + model + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}

class Clothing extends Product {
    // Specific features for clothing products
    // Implementation...

    String typeOfCloth;
    String size;
    Clothing(String productName, double price, String description, String typeOfCloth, String size) {
        super(productName, price, description);
        this.typeOfCloth = typeOfCloth;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "typeOfCloth='" + typeOfCloth + '\'' +
                ", size='" + size + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}

class Books extends Product {
    // Specific features for book products
    // Implementation...
    int pages;
    String authorName;
    Books(String productName, double price, String description, String authorName, int pages) {
        super(productName, price, description);
        this.authorName = authorName;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Books{" +
                "pages=" + pages +
                ", authorName='" + authorName + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}


public class ECommerceProductCatalog {
    public static void main(String[] args) {
        Electronics laptop = new Electronics("Laptop", 999.99, "High-performance laptop", "LP1234");
        Clothing shirt = new Clothing("T-shirt", 19.99, "Cotton T-shirt", "cotton", "XL");
        Books novel = new Books("The Great Novel", 29.99, "Bestseller", "Suman", 132);
        System.out.println(laptop.toString());
        System.out.println(shirt.toString());
        System.out.println(novel.toString());
    }
}

//Problem Statement 2: E-commerce Product Catalog
//Build an e-commerce system where products are categorized into different types, such as Electronics, Clothing, and Books. Implement an inheritance hierarchy to model the relationship between the generic Product class and its specialized subclasses, considering attributes specific to each category.
//
//Requirements:
//Create a base class "Product" with properties like productName, price, and description.
//Implement subclasses for Electronics, Clothing, and Books, each with category-specific features.
//Allow for easy addition of new product categories without modifying existing code.
//
//Sample code:
//
//class Product {
//    String productName;
//    double price;
//    String description;
//
//    Product(String productName, double price, String description) {
//        this.productName = productName;
//        this.price = price;
//        this.description = description;
//    }
//}
//
//class Electronics extends Product {
//    // Specific features for electronics products
//    // Implementation...
//}
//
//class Clothing extends Product {
//    // Specific features for clothing products
//    // Implementation...
//}
//
//class Books extends Product {
//    // Specific features for book products
//    // Implementation...
//}
//
//Sample Input:
//Creating instances of different product categories with varying attributes:
//
//Electronics laptop = new Electronics("Laptop", 999.99, "High-performance laptop");
//Clothing shirt = new Clothing("T-shirt", 19.99, "Cotton T-shirt");
//Books novel = new Books("The Great Novel", 29.99, "Bestseller");
