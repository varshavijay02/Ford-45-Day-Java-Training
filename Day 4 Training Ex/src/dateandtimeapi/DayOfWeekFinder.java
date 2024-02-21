package dateandtimeapi;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;

public class DayOfWeekFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input date (yyyy-MM-dd): ");
        String date = sc.nextLine();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(date, dateFormatter);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println("Day of week: "+dayOfWeek.toString());
    }
}

//Problem 1: Basic Date Operations
//Create a program that takes a date as input and prints the day of the week.
//Requirements:
//Input a date in the format "yyyy-MM-dd".
//Output the day of the week.
//
//Operations to Perform:
//Parse the input string to create a LocalDate object.
//Use the DayOfWeek enum to get the day of the week.
//
//Code Stub:
//import java.time.LocalDate;
//import java.time.DayOfWeek;
//import java.time.format.DateTimeFormatter;
//
//public class DayOfWeekFinder {
//    public static void main(String[] args) {
//        // Your code here
//    }
//}
//
//
//Sample Input:
//2024-02-12
//Sample Output:
//Monday
