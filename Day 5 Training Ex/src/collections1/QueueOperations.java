package collections1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueOperations {
    public static void main(String[] args) {
        Queue<String> stringQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Implement operations here
        stringQueue.offer("apple");
//        stringQueue.offer("mango");
//        System.out.println("Element Apple enqueued.");
        System.out.println("Element dequeued: "+stringQueue.poll());
        System.out.println(stringQueue.isEmpty()?"Queue is empty.":"Queue elements: "+stringQueue);

        scanner.close();
    }
}

//Problem 4: Queue Operations
//Implement a Java program to perform basic queue operations.
//Requirements:
//Create a program that simulates a queue and allows users to enqueue, dequeue, and display elements.
//
//Operations to Perform:
//a. Enqueue an element to the queue.
//b. Dequeue an element from the queue.
//c. Display all elements in the queue.
//
//Code Stub:
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//public class QueueOperations {
//    public static void main(String[] args) {
//        Queue<String> stringQueue = new LinkedList<>();
//        Scanner scanner = new Scanner(System.in);
//
//        // Implement operations here
//
//        scanner.close();
//    }
//}
//Sample Input:
//1  // Enqueue element
//Apple
//2  // Dequeue element
//3  // Display all elements
//
//Sample Output:
//Element Apple enqueued.
//Element dequeued: Apple
//Queue is empty.
