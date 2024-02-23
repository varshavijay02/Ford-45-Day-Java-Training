package collections1;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class BasicListManipulation {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Implement operations here

        boolean flag = true;
        while(flag) {
            System.out.println("\n1  // Add element\n" +
                    "2  // Remove element\n" +
                    "3  // Find element index\n" +
                    "4  // Display all elements\n" +
                    "5  // Exit\n"
            );
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    int numToAdd = scanner.nextInt();
                    integerList.add(numToAdd);
                    System.out.println("Element " + numToAdd + " added to the list.");
                    break;
                case 2:
                    System.out.print("Enter element to remove: ");
                    Integer numToRemove = scanner.nextInt();
                    integerList.remove(numToRemove);
                    System.out.println("Element " + numToRemove + " removed from the list.");
                    break;
                case 3:
                    System.out.print("Enter element to find: ");
                    int numToFind = scanner.nextInt();
                    int index = integerList.indexOf(numToFind);
                    if(index==-1) System.out.println("Element not found");
                    else System.out.println("Element " + numToFind + " found at index " + index + ".");
                    break;
                case 4:
                    System.out.print("Elements in the list: " + integerList.toString());
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }

        scanner.close();

    }
}

//Problem 1: Basic List Manipulation
//Implement a Java program to perform basic operations on a list of integers.
//
//Requirements:
//Create a program that allows users to add, remove, find, and display elements in a list.
//
//Operations to Perform:
//a. Add an element to the list.
//b. Remove an element from the list.
//c. Find the index of a specific element.
//d. Display all elements in the list.
//
//Code Stub:
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class BasicListManipulation {
//    public static void main(String[] args) {
//        List<Integer> integerList = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//
//        // Implement operations here
//
//        scanner.close();
//    }
//}
//Sample Input:
//1  // Add element
//2  // Remove element
//3  // Find element index
//4  // Display all elements
//
//Sample Output:
//Enter element to add: 5
//Element 5 added to the list.
//Enter element to remove: 3
//Element 3 removed from the list.
//Enter element to find: 7
//Element 7 found at index 2.
//Elements in the list: [1, 2, 5, 7, 4]
