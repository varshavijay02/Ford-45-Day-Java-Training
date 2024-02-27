package shopping_cart_test;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> productList = new ArrayList<>();

    public void addProduct(String productName, double price) {
        /* method implementation */
        Product product = new Product(productName, price);
        productList.add(product);
        System.out.println("product added");
    }
    public void removeProduct(String productName) {
        /* method implementation */
        boolean flag = false;
        for(Product product: productList){
            if(product.getProductName().equals(productName)){
                productList.remove(product);
                flag = true;
                break;
            }
        }
        if(!flag) System.out.println("removal unsuccessful");
        else System.out.println("removal successful");
    }
    public double calculateTotalPrice() {
        /* method implementation */
        double totalPrice = 0;
        for(Product product: productList){
            totalPrice+=product.getPrice();
        }
        return totalPrice;
    }
    public boolean isCartEmpty() {
        /* method implementation */
        return productList.isEmpty();
    }
}

//Problem 3: Testing a Shopping Cart
//Write JUnit tests for a shopping cart application that manages product additions and removals.
//
//Requirements:
//- ShoppingCart class with methods to add and remove items.
//- JUnit test cases to verify the cart's behavior.
//
//Operations to Perform:
//1. Add Product to Cart
//2. Remove Product from Cart
//3. Check Total Price
//4. Check Cart Empty State
//
//Code Stub:
//public class ShoppingCart {
//    public void addProduct(String product, double price) { /* method implementation */ }
//    public void removeProduct(String product) { /* method implementation */ }
//    public double calculateTotalPrice() { /* method implementation */ }
//    public boolean isCartEmpty() { /* method implementation */ }
//}
//
//Sample Input:
//Add Product: "Laptop", Price: $1000.00
//Remove Product: "Smartphone"
//
//Sample Output:
//Total Price: $1000.00
//Cart Empty State: false
