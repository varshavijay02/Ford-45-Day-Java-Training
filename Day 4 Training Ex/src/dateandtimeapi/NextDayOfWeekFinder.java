package dateandtimeapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class NextDayOfWeekFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String day = sc.nextLine();
        DayOfWeek dayOfWeek = DayOfWeek.valueOf(day.toUpperCase());
        LocalDate localDate = LocalDate.parse(date);
        LocalDate nextDate = localDate.with(TemporalAdjusters.next(dayOfWeek));
        System.out.println(nextDate);
    }
}

//Problem 8: Advanced Date Query
//Write a program that finds the next occurrence of a specified day of the week after a given date.
//
//Requirements:
//Input a date in the format "yyyy-MM-dd".
//Input a day of the week (e.g., "Wednesday").
//Output the next occurrence of the specified day of the week after the given date.
//
//Operations to Perform:
//Parse the input string to create a LocalDate object.
//Use DayOfWeek and TemporalAdjusters to find the next occurrence.
//
//Code Stub:
//
//import java.time.LocalDate;
//import java.time.DayOfWeek;
//import java.time.temporal.TemporalAdjusters;
//
//public class NextDayOfWeekFinder {
//    public static void main(String[] args) {
//        // Your code here
//    }
//}
//Sample Input:
//2024-02-12
//Friday
//
//Sample Output:
//2024-02-16
