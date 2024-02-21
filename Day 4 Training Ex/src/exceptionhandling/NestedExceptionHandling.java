package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class NestedExceptionHandling {
    public static void readFromFile(String path) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Error closing file: " + e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide path to non-existent file: ");
        String filePath = sc.next();

        try {
            readFromFile(filePath);
        } catch (FileNotFoundException f){
            System.err.println("Error reading file: " + f.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}

//Problem 4: Nested Exception Handling
//Create a program that demonstrates nested exception handling for a file reading operation.
//
//Requirements:
//Read content from a file.
//Handle both FileNotFoundException and IOException with nested exception handling.
//
//Operations to Perform:
//Attempt to read from a file.
//Handle exceptions with nested exception handling.
//
//Code Stub:
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class NestedExceptionHandling {
//    // Code goes here
//}
//
//Sample Input:
//Provide path to non-existent file: non-existent.txt
//
//Sample Output:
//Error: File not found or could not be read.
