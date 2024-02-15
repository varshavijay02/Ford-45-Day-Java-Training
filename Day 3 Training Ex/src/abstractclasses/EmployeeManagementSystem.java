package abstractclasses;

import java.util.Scanner;

abstract class Employee{
    String name;
    String employeeId;
    double monthlySalary;
    double calcAnnualSalary(){
        return monthlySalary*12;
    }
}

class Manager extends Employee{
    public Manager(double monthlySalary, String employeeId) {
        this.monthlySalary = monthlySalary;
        this.employeeId = employeeId;
        this.name = "Manager";
    }

    @Override
    double calcAnnualSalary() {
        return super.calcAnnualSalary();
    }
}

class Developer extends Employee{
    public Developer(double monthlySalary, String employeeId) {
        this.monthlySalary = monthlySalary;
        this.employeeId = employeeId;
        this.name = "Developer";
    }

    @Override
    double calcAnnualSalary() {
        return super.calcAnnualSalary();
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("For Manager:");
        System.out.print("Monthly Salary = ");
        double managerMonthlySalary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Employee ID = ");
        String managerId = sc.nextLine();
        Manager manager = new Manager(managerMonthlySalary, managerId);

        System.out.println("For Developer:");
        System.out.print("Monthly Salary = ");
        double developerMonthlySalary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Employee ID = ");
        String developerId = sc.nextLine();
        Developer developer = new Developer(developerMonthlySalary, developerId);

        System.out.println("Manager - Annual Salary: "+manager.calcAnnualSalary());
        System.out.println("Developer - Annual Salary: "+developer.calcAnnualSalary());
    }
}

//Problem Statement 2: Employee Management System with Method Overriding
//Create an abstract class named "Employee" with attributes "name," "employeeId," and "monthlySalary." Derive two classes, "Manager" and "Developer," from the abstract class. Implement methods to calculate the annual salary for each type of employee.
//Requirements:
//Define an abstract class "Employee" with attributes "name," "employeeId," and "monthlySalary."
//Implement two classes, "Manager" and "Developer," inheriting from "Employee."
//Include methods to calculate the annual salary for each type of employee.
//
//Operations to Perform:
//Implement the "calculateAnnualSalary()" method in both "Manager" and "Developer" classes, using method overriding.
//Use the super keyword to invoke the overridden methods from the parent class.
//Write a program to instantiate objects of each class and display their attributes and annual salary.
//
//Sample Code Stub:
//abstract class Employee {
//    // Attributes: name, employeeId, monthlySalary
//    abstract double calculateAnnualSalary();
//}
//
//class Manager extends Employee {
//    // Implement constructor and override calculateAnnualSalary() method
//}
//
//class Developer extends Employee {
//    // Implement constructor and override calculateAnnualSalary() method
//}
//
//public class Main {
//    public static void main(String[] args) {
//        // Instantiate Manager and Developer objects, display attributes and annual salary
//    }
//}
//
//
//Sample Input:
//For Manager: Monthly Salary = 5000, Employee ID = "M001"
//For Developer: Monthly Salary = 4000, Employee ID = "D001"
//Sample Output:
//Manager - Annual Salary: 60000
//Developer - Annual Salary: 48000
