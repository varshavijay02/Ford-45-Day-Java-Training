package dateandtimeapi;

//import java.time.LocalDate;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DurationCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date1 = sc.nextLine();
        String date2 = sc.nextLine();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDate1 = LocalDateTime.parse(date1, dateTimeFormatter);
        LocalDateTime localDate2 = LocalDateTime.parse(date2, dateTimeFormatter);
        Duration duration = Duration.between(localDate1,localDate2);
        System.out.println("Duration: "+duration.toDays()+" days, "+duration.toHours()
                +" hours, "+duration.toMinutes()+" minutes, and "+duration.toSeconds()+" seconds");
    }
}

//Problem 4: Duration Calculation
//Write a program that calculates the duration between two given dates.
//
//Requirements:
//Input two dates in the format "yyyy-MM-dd HH:mm:ss".
//Output the duration between the two dates in days, hours, and minutes.
//
//Operations to Perform:
//Parse the input strings to create LocalDateTime objects.
//Calculate the duration between the two dates using Duration class.
//Extract days, hours, and minutes from the duration.
//
//Code Stub:
//import java.time.LocalDateTime;
//import java.time.Duration;
//import java.time.format.DateTimeFormatter;
//public class DurationCalculator {
//    public static void main(String[] args) {
//        // Your code here
//    }
//}
//
//Sample Input:
//2024-02-12 10:30:00
//2024-02-15 15:45:30
//
//Sample Output:
//Duration: 3 days, 5 hours, 15 minutes, and 30 seconds
