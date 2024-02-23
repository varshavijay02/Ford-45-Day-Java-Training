package collections2;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.Set;
import java.util.Scanner;

class Product {
    // Product class definition with attributes like name, price, quantity, etc.
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Set<Product> shoppingCart = new TreeSet<>(Comparator.comparingDouble(Product::getPrice).reversed());
        Scanner scanner = new Scanner(System.in);

        // Implement operations here
        System.out.println("Add product");
        String name = scanner.nextLine();
        double price = scanner.nextDouble();
        scanner.nextLine();
        Product product = new Product(name, price);
        shoppingCart.add(product);
        shoppingCart.add(new Product("Smartphone", 899.99));
        shoppingCart.add(new Product("Fridge", 500.00));
        System.out.println("Remove product");
        double rem = scanner.nextDouble();
        scanner.nextLine();
        for(Product product1: shoppingCart){
            if(product1.getPrice()==rem){
                shoppingCart.remove(product1);
            }
        }
        System.out.println("Display Shopping Cart:");
        for(Product product1: shoppingCart){
            System.out.println(product1);
        }

        scanner.close();

    }
}

//Problem 11: Shopping Cart
//Create a Java program to simulate a shopping cart using a collection.
//
//Requirements:
//Implement a program that allows users to add, remove, and display product
// objects in a shopping cart based on their prices.
//
//Operations to Perform:
//a. Add a product to the shopping cart.
//b. Remove a product based on its price.
//c. Display all products in descending order of their prices.
//
//Code Stub:
//import java.util.TreeSet;
//import java.util.Set;
//import java.util.Scanner;
//
//class Product {
//    // Product class definition with attributes like name, price, quantity, etc.
//}
//
//public class ShoppingCart {
//    public static void main(String[] args) {
//        Set<Product> shoppingCart = new TreeSet<>(Comparator.comparingDouble(Product::getPrice).reversed());
//        Scanner scanner = new Scanner(System.in);
//
//        // Implement operations here
//
//        scanner.close();
//    }
//}
//Sample Input:
//1  // Add product
//Laptop
//999.99
//2  // Remove product
//500.0
//3  // Display all products
//Sample Output:
//Product added: Laptop - $999.99
//Product with price $500.0 removed from the shopping cart.
//Products in descending order of price:
//Laptop - $999.99
//Smartphone - $899.99
