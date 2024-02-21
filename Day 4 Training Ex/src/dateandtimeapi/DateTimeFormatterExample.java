package dateandtimeapi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.time.LocalDateTime.now;

public class DateTimeFormatterExample {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.parse(now().toString());
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss")));
    }
}

//Problem 3: Date Formatting
//Create a program that formats the current date and time in a custom format.
//
//Requirements:
//Output the current date and time in the format "dd-MMM-yyyy HH:mm:ss".
//
//Operations to Perform:
//Use LocalDateTime to get the current date and time.
//Format the date using a custom DateTimeFormatter.
//
//Code Stub:
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//
//public class DateTimeFormatterExample {
//    public static void main(String[] args) {
//        // Your code here
//    }
//}
//
//Sample Input:
//N/A
//Sample Output:
//12-Feb-2024 15:30:45
