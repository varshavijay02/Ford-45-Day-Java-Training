package encapsulation;

class ShoppingCart {
    private String[] itemNames;
    private double[] itemPrices;

    // Constructor and methods for adding items, calculating total price, and displaying items

    private static int index = 0;

    public ShoppingCart() {
        itemNames = new String[10];
        itemPrices = new double[10];
    }

    void addItem(String itemName, double itemPrice){
        itemNames[index] = itemName;
        itemPrices[index++] = itemPrice;
    }

    double calculateTotalPrice(){
        double totalPrice = 0;
        for(double price: itemPrices){
            totalPrice+=price;
        }
        return totalPrice;
    }

    void displayCart(){
        System.out.println("Items in Cart:");
        for(int i=0; i<index;i++){
            System.out.println(itemNames[i]);
        }
    }
}


public class OnlineShoppingCart {
    public static void main(String[] args) {
        // Sample Usage
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop", 1200.0);
        cart.addItem("Headphones", 150.0);
        System.out.println("Total Price: " + cart.calculateTotalPrice());
        cart.displayCart();

    }
}

///Problem 3: Online Shopping Cart
//
//Create a ShoppingCart class encapsulating the items in an online shopping cart. Implement methods to add items, calculate the total price, and display the items in the cart.
//
//Requirements:
//
//The ShoppingCart class should have private arrays for item names and their prices.
//Implement methods for adding items, calculating the total price, and displaying the items in the cart.
//
//Sample code:
//
//public class ShoppingCart {
//    private String[] itemNames;
//    private double[] itemPrices;
//
//    // Constructor and methods for adding items, calculating total price, and displaying items
//}
//
//
//// Sample Usage
//ShoppingCart cart = new ShoppingCart();
//cart.addItem("Laptop", 1200.0);
//cart.addItem("Headphones", 150.0);
//System.out.println("Total Price: " + cart.calculateTotalPrice());
//cart.displayCart();
