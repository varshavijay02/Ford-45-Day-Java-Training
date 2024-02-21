package dateandtimeapi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date1 = sc.nextLine();
        String date2 = sc.nextLine();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate1 = LocalDate.parse(date1, dateFormatter);
        LocalDate localDate2 = LocalDate.parse(date2, dateFormatter);
        if(localDate1.isBefore(localDate2)){
            System.out.println("First date is before the second date.");
        }else if(localDate1.isAfter(localDate2)){
            System.out.println("First date is after the second date.");
        }else{
            System.out.println("First date is equal to second date.");
        }
    }
}

//Problem 2: Date Comparison
//Write a program that compares two dates and determines if one is before, after, or equal to the other.
//
//Requirements:
//Input two dates in the format "yyyy-MM-dd".
//Output whether the first date is before, after, or equal to the second date.
//
//Operations to Perform:
//Parse the input strings to create LocalDate objects.
//Use the isBefore, isAfter, and isEqual methods to compare dates.
//
//Code Stub:
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//
//public class DateComparison {
//    public static void main(String[] args) {
//        // Your code here
//    }
//}
//
//Sample Input:
//2024-02-12
//2024-02-15
//Sample Output:
//First date is before the second date.
