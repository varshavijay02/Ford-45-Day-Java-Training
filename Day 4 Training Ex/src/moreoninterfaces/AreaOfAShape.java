package moreoninterfaces;

import java.util.Scanner;

interface ShapeInterface{
    double calculateArea();
}

class Shape implements ShapeInterface{
    protected String shapeName;

    public double calculateArea(){
        return 0.0;
    }

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }
}

class Square extends Shape{

    private int side;

    public double calculateArea(){
        return side*side;
    }

    public Square(int side) {
        super("Square");
        this.side = side;
    }
}

class Rectangle extends Shape{
    private int length;
    private int breadth;

    public double calculateArea(){
        return length*breadth;
    }

    public Rectangle(int length, int breadth) {
        super("Rectange");
        this.length = length;
        this.breadth = breadth;
    }
}

class Circle extends Shape{
    private int radius;

    public double calculateArea(){
        return radius*radius*3.14;
    }

    public Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }
}

public class AreaOfAShape {
    public static void main(String[] args) {
        System.out.println("1. Rectangle\n" +
                "2. Square\n" +
                "3. Circle\n" +
                "Area Calculator --- Choose your shape\n");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("Enter length and breadth:");
                int length = sc.nextInt();
                int breadth = sc.nextInt();
                Rectangle rectangle = new Rectangle(length,breadth);
                System.out.println("Area of Rectangle is: "+String.format("%.2f",rectangle.calculateArea()));
                break;
            case 2:
                System.out.println("Enter side: ");
                int side = sc.nextInt();
                Square square = new Square(side);
                System.out.println("Area of Square is: "+String.format("%.2f",square.calculateArea()));
                break;
            case 3:
                System.out.println("Enter Radius: ");
                int radius = sc.nextInt();
                Circle circle = new Circle(radius);
                System.out.println("Area of Circle is: "+String.format("%.2f",circle.calculateArea()));
                break;
            default:
                System.out.println("Invalid input: Input should be 1, 2 or 3 only.");
        }
    }
}

//Area of a Shape
//
//Write a program to calculate the area of the given shape using a menu driven application.
//Create a base class called Shape.
//Data members:
//protected String shapeName;
//Methods:
//calculateArea() – Return type of this method is Double. This method should return the value 0.
//Constructor:
//Create a single argument constructor that initializes the shapeName.

//Create a class called Square that extends Shape
//Data members:
//side – of type Integer.
//Methods:
//calculateArea() – calculates and returns the area of the square. The return type of this method is Double.
//Constructor:
//Create a constructor that initializes the side. (1-argument constructor).
//Call the super class constructor to initialize the shapeName as "Square".
//
//Create a class called Rectangle that extends Shape
//Data members:
//length – of type Integer.
//breadth – of type Integer.
//Methods:
//calculateArea() – calculates and returns the area of the Rectangle. The return type of this method is Double.
//Constructor:
//Create a constructor that initializes the length and breadth. (2-argument constructor).
//Call the super class constructor to initialize the shapeName as "Rectangle".

//Create a class called Circle that extends Shape
//Data members:
//radius – of type Integer.
//Methods:
//calculateArea() – calculates and returns the area of the Circle. The return
// type of this method is Double.
//Constructor:
//Create a constructor that initializes the radius. (1-argument constructor).
//Call the super class constructor to initialize the shapeName as "Circle".

//Include appropriate getters and setters in all the given classes.

//Create a class Main to capture the input details from the user and display the calculated
// area to the user.
//Input and Output Format:
//Refer sample input and output for formatting specifications.
//All text in bold corresponds to input and the rest corresponds to output.
// Format the output with two decimal points
//Note: Code submission not required. To be implemented using eclipse IDE and manually
// verified by the SME.
//
// Sample Input and Output 1:
//1. Rectangle
//2. Square
//3. Circle
//Area Calculator --- Choose your shape
//1
//Enter length and breadth:
//100
//40
//Area of Rectangle is:4000.00
//
//Sample Input and Output 2:
//1. Rectangle
//2. Square
//3. Circle
//Area Calculator --- Choose your shape
//2
//Enter side:
//20
//Area of Square is:400.00
//
//Sample Input and Output 3:
//1. Rectangle
//2. Square
//3. Circle
//Area Calculator --- Choose your shape
//3
//Enter Radius:
//5
//Area of Circle is:78.54
