package interfaces;

abstract class Shape {
    abstract double calculateArea();
    abstract void displayInfo();
}

class Circle extends Shape {
    // Implement methods for circles
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return radius*radius*3.14;
    }

    @Override
    void displayInfo() {
        System.out.println("This is a circle with radius "+radius+" cm");
    }

}

class Rectangle extends Shape {
    // Implement methods for rectangles
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return length*breadth;
    }

    @Override
    void displayInfo() {
        System.out.println("This is a rectangle with length "+length+" cm and breadth "+breadth+" cm");
    }
}

public class AbstractClassInheritance {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(10,8);

        System.out.println("Circle Area: "+String.format("%.2f",circle.calculateArea())+" sq.cm");
        circle.displayInfo();

        System.out.println("Rectangle Area: "+String.format("%.2f",rectangle.calculateArea())+" sq.cm");
        rectangle.displayInfo();
    }
}

//Problem Statement 2: Abstract Class Inheritance
//Create an application for managing different shapes, including circles and rectangles. Utilize abstract classes for the common features and inheritance for specific shape implementations.
//
//Requirements:
//Abstract class Shape with abstract methods calculateArea and displayInfo
//Concrete classes: Circle and Rectangle inheriting from Shape
//
//Operations to Perform:
//Implement methods to calculate area for circles and rectangles
//Display shape information using the displayInfo method
//
//Sample Code Stub:
//abstract class Shape {
//    abstract double calculateArea();
//    abstract void displayInfo();
//}
//
//class Circle extends Shape {
//    // Implement methods for circles
//}
//
//class Rectangle extends Shape {
//    // Implement methods for rectangles
//}
//
//Sample Input:
//Create a circle with radius 5
//Create a rectangle with length 10 and width 8
//
//Sample Output:
//Area of the circle: 78.54
//Area of the rectangle: 80.0
