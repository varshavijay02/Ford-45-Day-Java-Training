package dateandtimeapi;

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime.toString());
    }
}

//Problem 5: Zoned Date-Time
//Create a program that displays the current date and time in a specific time zone.
//
//Requirements:
//Input a time zone (e.g., "America/New_York").
//Output the current date and time in the specified time zone.
//
//Operations to Perform:
//Use ZonedDateTime to get the current date and time in a specific time zone.
//
//Code Stub:
//import java.time.ZonedDateTime;
//import java.time.ZoneId;
//
//public class ZonedDateTimeExample {
//    public static void main(String[] args) {
//        // Your code here
//    }
//}
//
//Sample Input:
//America/Los_Angeles
//
//Sample Output:
//2024-02-12T12:30:00-08:00[America/Los_Angeles]
