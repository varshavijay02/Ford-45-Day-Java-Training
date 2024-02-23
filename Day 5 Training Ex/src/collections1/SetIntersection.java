package collections1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetIntersection {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        // Implement operations here
        String[] input1 = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");
        for(String str: input1){
            set1.add(str);
        }
        for(String str: input2){
            set2.add(str);
        }

        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Common elements: "+intersection);

        scanner.close();
    }
}


//Problem 2: Set Intersection
//Write a Java program to find the intersection of two sets.
//
//Requirements:
//Create a program that takes two sets of strings and returns their common elements.
//
//Operations to Perform:
//a. Input two sets of strings.
//b. Find the intersection of the sets.
//c. Display the common elements.
//
//Code Stub:
//import java.util.HashSet;
//import java.util.Set;
//import java.util.Scanner;
//
//public class SetIntersection {
//    public static void main(String[] args) {
//        Set<String> set1 = new HashSet<>();
//        Set<String> set2 = new HashSet<>();
//        Scanner scanner = new Scanner(System.in);
//
//        // Implement operations here
//
//        scanner.close();
//    }
//}
//
//Sample Input:
//3  // Number of elements in set1
//apple
//banana
//orange
//4  // Number of elements in set2
//banana
//cherry
//orange
//
//Sample Output:
//Common elements: [banana, orange]
