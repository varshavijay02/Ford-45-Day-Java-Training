package collections1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapPopulation {
    public static void main(String[] args) {
        Map<String, Integer> studentGrades = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Implement operations here
        studentGrades.put("Mary",67);
        studentGrades.put("Yadav",87);
        studentGrades.put("Javad",79);
        System.out.println("Add student and grade");
        String name = scanner.nextLine();
        int marks = scanner.nextInt();
        studentGrades.put(name,marks);
        scanner.nextLine();

        System.out.println("Remove student");
        String removeName = scanner.nextLine();
//        scanner.nextLine();
        Integer rem = (Integer) studentGrades.remove(removeName);

        System.out.println("Printing Hash map: "+studentGrades);



        scanner.close();
    }
}

//Problem 3: Map Population
//Develop a Java program to populate and manipulate a map of student grades.
//
//Requirements:
//Create a program that allows users to add, remove, and display student grades using a map.
//
//Operations to Perform:
//a. Add a student and their grade to the map.
//b. Remove a student from the map.
//c. Display all students and their grades.
//
//Code Stub:
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class MapPopulation {
//    public static void main(String[] args) {
//        Map<String, Integer> studentGrades = new HashMap<>();
//        Scanner scanner = new Scanner(System.in);
//
//        // Implement operations here
//
//        scanner.close();
//    }
//}
//Sample Input:
//1  // Add student and grade
//John
//85
//2  // Remove student
//Mary
//3  // Display all students and grades
//
//Sample Output:
//Student added: John (Grade: 85)
//Student Mary removed from the map.
//Students and their grades:
//John - 85
