package collections2;

import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

class Employee {
    // Employee class definition with attributes like employee ID, name, etc.
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class EmployeeDatabase {
    public static void main(String[] args) {
        Map<Integer, Employee> employeeDatabase = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        // Implement operations here
        System.out.println("Add employee");
        int id = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine();
//        scanner.nextLine();
        Employee employee = new Employee(id, name);
        employeeDatabase.put(id, employee);
        System.out.println(employeeDatabase);
        System.out.println("Remove employee");
        int idToRem = scanner.nextInt();
        employeeDatabase.remove(idToRem);
        System.out.println("Display all employees");
        System.out.println(employeeDatabase);


        scanner.close();

    }
}

//Problem 7: Employee Database
//Create a Java program to manage an employee database using a collection.
//Requirements:
//Implement a program that allows users to add, remove, and display employee
// objects based on their employee ID.
//
//Operations to Perform:
//a. Add an employee to the database.
//b. Remove an employee based on their employee ID.
//c. Display all employees in ascending order of their employee ID.
//
//Code Stub:
//import java.util.TreeMap;
//import java.util.Map;
//import java.util.Scanner;
//
//class Employee {
//    // Employee class definition with attributes like employee ID, name, etc.
//}
//
//public class EmployeeDatabase {
//    public static void main(String[] args) {
//        Map<Integer, Employee> employeeDatabase = new TreeMap<>();
//        Scanner scanner = new Scanner(System.in);
//
//        // Implement operations here
//
//        scanner.close();
//    }
//}
//Sample Input:
//1  // Add employee
//101
//John Doe
//2  // Remove employee
//101
//3  // Display all employees
//
//Sample Output:
//Employee added: John Doe (ID: 101)
//Employee with ID 101 removed from the database.
//Employees in ascending order of ID:
//102 - Jane Smith
//103 - Bob Johnson
