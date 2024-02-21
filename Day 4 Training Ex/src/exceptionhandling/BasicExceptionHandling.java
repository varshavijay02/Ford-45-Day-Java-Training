package exceptionhandling;

import java.util.Arrays;
import java.util.Scanner;

public class BasicExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int numerator = sc.nextInt();
        System.out.print("Enter denominator: ");
        int denominator = sc.nextInt();
        
        try{
            int answer = numerator/denominator;
            System.out.println("answer = " + answer);
            //note: if everything were in double then answer will be 'answer = infinity'.
        }catch(ArithmeticException ae){
            System.out.println("Error: Division by zero is not allowed.");
        }catch (Exception e){
            System.out.println("Some Error Has Occurred");
        }
    }
}

//Problem 1: Basic Exception Handling
//Implement a Java program that reads two integers from the user, divides them, 
// and handles the potential ArithmeticException if the denominator is zero.
//
//Requirements:
//User should input two integers.
//Handle ArithmeticException.
//
//Operations to Perform:
//Take two integers as input.
//Implement exception handling for division by zero.
//
//Code Stub:
//import java.util.Scanner;
//public class BasicExceptionHandling {
//    public static void main(String[] args) {
//        // Code goes here
//    }
//}
//
//Sample Input:
//Enter numerator: 10
//Enter denominator: 0
//
//Sample Output:
//Error: Division by zero is not allowed.
