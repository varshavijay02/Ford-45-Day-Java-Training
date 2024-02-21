package dateandtimeapi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateAdjustment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputDate = sc.nextLine();
        int num = sc.nextInt();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(inputDate,dateFormatter);
        System.out.println(localDate.plusDays(num));
    }
}

//Problem 6: Date Adjustment
//Write a program that adds or subtracts a specified number of days from a given date.
//
//Requirements:
//Input a date in the format "yyyy-MM-dd".
//Input an integer representing the number of days to add or subtract.
//Output the resulting date.
//
//Operations to Perform:
//Parse the input string to create a LocalDate object.
//Use the plusDays and minusDays methods to adjust the date.
//
//Code Stub:
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//public class DateAdjustment {
//    public static void main(String[] args) {
//        // Your code here
//    }
//}
//Sample Input:
//2024-02-12
//-5
//
//Sample Output:
//2024-02-07
