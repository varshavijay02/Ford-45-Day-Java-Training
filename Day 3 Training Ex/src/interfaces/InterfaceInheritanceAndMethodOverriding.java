package interfaces;

interface Product {
    double calculatePrice();
}

interface ShoppingCart {
    void addToCart(Product product);
    double calculateTotalPrice();
}

class ElectronicProduct implements Product {
    double price;

    public ElectronicProduct(double price) {
        this.price = price;
    }

    @Override
    public double calculatePrice() {
        return price;
    }
    // Implement methods for electronic products
}

class ClothingProduct implements Product {
    double price;

    public ClothingProduct(double price) {
        this.price = price;
    }

    @Override
    public double calculatePrice() {
        return price;
    }
    // Implement methods for clothing products
}

class ShoppingCartImpl implements ShoppingCart {
    private Product[] cartItems;

    private static int length = 0;

    public ShoppingCartImpl() {
        cartItems = new Product[100];
    }

    @Override
    public void addToCart(Product product) {
        cartItems[length++]=product;
    }

    @Override
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for(Product product: cartItems){
            if(product!=null){
                totalPrice+=product.calculatePrice();
            }
        }
        return totalPrice;
    }
    // Implement methods for shopping cart
}


public class InterfaceInheritanceAndMethodOverriding {
    public static void main(String[] args) {
        ShoppingCartImpl cart = new ShoppingCartImpl();

        ElectronicProduct laptop = new ElectronicProduct(1200.00);
        ClothingProduct shirt = new ClothingProduct(30.00);

        cart.addToCart(laptop);
        cart.addToCart(shirt);

        System.out.println("Total Price in the Shopping Cart: $" + cart.calculateTotalPrice());
    }
}

//Problem Statement 5: Interface Inheritance and Method Overriding
//Design an online shopping application with interfaces for Product and ShoppingCart. Implement different types of products (Electronics, Clothing) and shopping carts. Demonstrate method overriding for calculating total prices.
//
//Requirements:
//Interfaces Product and ShoppingCart with relevant methods
//Concrete classes for electronic and clothing products
//Override methods to calculate total prices in shopping carts
//
//Operations to Perform:
//Add electronic and clothing products to the shopping cart
//Calculate the total price using overridden methods
//
//Sample Code Stub:
//interface Product {
//    double calculatePrice();
//}
//
//interface ShoppingCart {
//    void addToCart(Product product);
//    double calculateTotalPrice();
//}
//
//class ElectronicProduct implements Product {
//    // Implement methods for electronic products
//}
//
//class ClothingProduct implements Product {
//    // Implement methods for clothing products
//}
//
//class ShoppingCartImpl implements ShoppingCart {
//    // Implement methods for shopping cart
//}
//
//Sample Input:
//Add a laptop (ElectronicProduct) to the shopping cart
//Add a shirt (ClothingProduct) to the shopping cart
//
//Sample Output:
//Total Price in the Shopping Cart: $1200.00
