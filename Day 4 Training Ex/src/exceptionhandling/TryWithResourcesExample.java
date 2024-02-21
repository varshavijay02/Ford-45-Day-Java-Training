package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResourcesExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide path to a file: ");
        String filePath = sc.next();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}

//Problem 5: Try-with-Resources
//Implement a Java program that uses the try-with-resources statement to automatically close a resource (e.g., a file).
//
//Requirements:
//Open and read content from a file using try-with-resources.
//Handle IOException if file reading fails.
//
//Operations to Perform:
//Use try-with-resources to open and read from a file.
//Handle IOException if an error occurs.
//
//Code Stub:
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class TryWithResourcesExample {
//    // Code goes here
//}
//
//Sample Input:
//Provide path to file: sample.txt
//
//Sample Output:
//Content of the file: ...
