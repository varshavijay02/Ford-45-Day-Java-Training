package dateandtimeapi;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DaylightSavingTimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(date,dateFormatter);
        ZoneId zone = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate.atStartOfDay(),zone);
        boolean isDayLightSavingsTime = zone.getRules().isDaylightSavings(zonedDateTime.toInstant());
        if(isDayLightSavingsTime){
            System.out.println("The date is within the daylight saving time period.");
        }else{
            System.out.println("The date is not within the daylight saving time period.");
        }

    }
}

//Problem 7: Daylight Saving Time
//Create a program that checks if a given date falls within the daylight saving time period.
//
//Requirements:
//Input a date in the format "yyyy-MM-dd".
//Output whether the given date is within the daylight saving time period.
//
//Operations to Perform:
//Parse the input string to create a LocalDate object.
//Use ZoneId and ZonedDateTime to check for daylight saving time.
//
//Code Stub:
//import java.time.LocalDate;
//import java.time.ZoneId;
//import java.time.ZonedDateTime;
//
//public class DaylightSavingTimeChecker {
//    public static void main(String[] args) {
//        // Your code here
//    }
//}
//
//Sample Input:
//2024-06-15
//
//Sample Output:
//The date is within the daylight saving time period.
