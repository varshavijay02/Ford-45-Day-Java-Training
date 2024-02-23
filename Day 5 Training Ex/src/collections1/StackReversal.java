package collections1;

import java.util.Stack;
import java.util.Scanner;

public class StackReversal {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        // Implement operations here
        integerStack.add(1);
        integerStack.add(2);
        integerStack.add(3);
        integerStack.add(4);
        System.out.println("Original stack: "+integerStack);
        System.out.println("Reversed stack: "+integerStack.reversed());

        scanner.close();
    }
}

//Problem 5: Stack Reversal
//Write a Java program to reverse the elements of a stack.
//Requirements:
//Create a program that takes a stack of integers and reverses their order.
//
//Operations to Perform:
//a. Input elements to the stack.
//b. Reverse the order of elements.
//c. Display the reversed stack.
//
//Code Stub:
//import java.util.Stack;
//import java.util.Scanner;
//
//public class StackReversal {
//    public static void main(String[] args) {
//        Stack<Integer> integerStack = new Stack<>();
//        Scanner scanner = new Scanner(System.in);
//
//        // Implement operations here
//
//        scanner.close();
//    }
//}
//Sample Input:
//
//4  // Number of elements in the stack
//1
//2
//3
//4
//Sample Output:
//Original stack: [1, 2, 3, 4]
//Reversed stack: [4, 3, 2, 1]
