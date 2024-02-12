import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {

        //1: Declare and Initialize array in a single line using curly braces.
//        String[] daysOfWeek = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};

        //2: Declare and Initialize array elements using new keyword.
        String[] daysOfWeek = new String[]{"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number (1 - 7 only)");
        int dayNumber = sc.nextInt();
        System.out.println("Day of the week is "+daysOfWeek[dayNumber-1]);
    }
}

//Write a program to find the day of the week for the day number given. 1 should return Sun, 2 should return Mon, etc.

//Input and Output Format:
//Refer sample input and output for formatting specifications.
//All text in bold corresponds to input and the rest corresponds to output.
//Note: Code submission not required. To be implemented using eclipse IDE and manually verified by the SME.
//Sample Input and Output:
//Enter the day number
//3
//Day of the week is Tue
