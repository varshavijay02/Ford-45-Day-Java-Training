package abstractclasses;

import java.util.Scanner;

abstract class Shape {
    // Attributes: name, color
    protected String name;
    protected String color;
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    // Implement constructor and override calculateArea(), calculatePerimeter() methods

    double radius;


    public Circle(double radius, String color) {
        this.color = color;
        this.radius = radius;
        this.name = "Circle";
    }

    @Override
    double calculateArea() {
        return radius*radius*3.14;
    }

    @Override
    double calculatePerimeter() {
        return 2*3.14*radius;
    }
}

class Square extends Shape {
    // Implement constructor and override calculateArea(), calculatePerimeter() methods

    double sideLength;

    public Square(double sideLength, String color) {
        this.sideLength = sideLength;
        this.color = color;
        this.name = "Square";
    }

    @Override
    double calculateArea() {
        return sideLength*sideLength;
    }

    @Override
    double calculatePerimeter() {
        return 4*sideLength;
    }
}

public class ShapeAreaPerimeterCalc {
    public static void main(String[] args) {
        // Instantiate Circle and Square objects, display attributes, area, and perimeter
        Scanner sc = new Scanner(System.in);

        System.out.print("For Circle:\n"+"Radius = ");
        double radius = sc.nextDouble();
        sc.nextLine();
        System.out.print("Color = ");
        String circleColor = sc.nextLine();
        Circle circle = new Circle(radius, circleColor);

        System.out.print("For Square:\n"+"Side Length = ");
        double sideLength = sc.nextDouble();
        sc.nextLine();
        System.out.print("Color: ");
        String squareColor = sc.nextLine();
        Square square = new Square(sideLength, squareColor);

        System.out.println("Circle - Area: "+circle.calculateArea()+" square units, Perimeter: "+circle.calculatePerimeter()+" units");
        System.out.println("Square - Area: "+square.calculateArea()+" square units, Perimeter: "+square.calculatePerimeter()+" units");

    }
}

//Problem Statement-1:
//
//Create an abstract class named "Shape" with attributes "name" and "color." Derive two classes, "Circle" and "Square," from the abstract class. Implement methods to calculate the area and perimeter for each shape.
//
//Requirements:
//
//Define an abstract class "Shape" with attributes "name" and "color."
//
//Implement two classes, "Circle" and "Square," inheriting from "Shape."
//
//Include methods to calculate the area and perimeter for each shape.
//
//Operations to Perform:-
//
//Implement the "calculateArea()" and "calculatePerimeter()" methods in both "Circle" and "Square" classes, using method overriding.
//
//Use the super keyword to invoke the overridden methods from the parent class.
//
//Write a program to instantiate objects of each class and display their attributes, area, and perimeter.
//
//Sample Code Stub:
//
//abstract class Shape {
//
//// Attributes: name, color
//
//abstract double calculateArea();
//
//abstract double calculatePerimeter();
//
//}
//
//class Circle extends Shape {
//
//// Implement constructor and override calculateArea(), calculatePerimeter() methods
//
//}
//
//class Square extends Shape {
//
//// Implement constructor and override calculateArea(), calculatePerimeter() methods
//
//}
//
//public class Main {
//
//public static void main(String[] args) {
//
//// Instantiate Circle and Square objects, display attributes, area, and perimeter
//
//}
//
//}
//
//Sample Input:
//
//For Circle: Radius = 7, Color = "Red"
//
//For Square: Side Length = 5, Color = "Blue"
//
//Sample Output:
//
//Circle - Area: 153.94 square units, Perimeter: 43.98 units
//
//Square - Area: 25 square units, Perimeter: 20 units
