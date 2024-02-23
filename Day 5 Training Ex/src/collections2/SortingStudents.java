package collections2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student {
    // Student class definition with attributes like name, ID, GPA, etc.
    private String name;
    private int id;
    private double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return name+" (ID: "+id+") - GPA: "+String.format("%.1f",gpa);
    }
}

class StudentGpaComparator implements Comparator<Student> {

    @Override
    public int compare(Student c1, Student c2) {
        return Double.compare(c1.getGpa(), c2.getGpa());
    }
}


public class SortingStudents {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Implement operations here
        int numOfInput = scanner.nextInt();
        scanner.next();
        for(int i=0;i<numOfInput;i++) {
            String name = scanner.nextLine();
            int id = scanner.nextInt();
            double gpa = scanner.nextDouble();
            scanner.nextLine();
            studentList.add(new Student(name, id, gpa));
        }

        System.out.println("Students sorted by GPA:");
        Collections.sort(studentList, new StudentGpaComparator());
        for(Student student: studentList){
            System.out.println(student);
        }

        scanner.close();

    }
}

//Problem 9: Sorting Students
//Write a Java program to sort a collection of student objects based on their GPA.
//
//Requirements:
//Create a program that allows users to input student details and then sort and display the students based on their GPA.
//
//Operations to Perform:
//a. Input student details (name, ID, GPA).
//b. Sort the students in ascending order of GPA.
//c. Display the sorted list of students.
//
//Code Stub:
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Scanner;
//
//class Student {
//    // Student class definition with attributes like name, ID, GPA, etc.
//}
//
//public class SortingStudents {
//    public static void main(String[] args) {
//        List<Student> studentList = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//
//        // Implement operations here
//
//        scanner.close();
//    }
//}
//Sample Input:
//2  // Number of students
//John Doe
//101
//3.5
//Jane Smith
//102
//4.0
//
//Sample Output:
//Students sorted by GPA:
//John Doe (ID: 101) - GPA: 3.5
//Jane Smith (ID: 102) - GPA: 4.0
