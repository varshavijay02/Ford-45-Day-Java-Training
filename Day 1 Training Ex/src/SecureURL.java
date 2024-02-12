import java.util.Scanner;

public class SecureURL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string ");
        String url = sc.nextLine();
        System.out.println("Enter the start string");
        String start = sc.nextLine();
        String urlStart = url.substring(0,start.length());
        System.out.println(url+" " + (urlStart.equals(start) ? " starts ": " does not start ") + " with " + start);
    }
}

//Write a program to check whether the given URL is secure.
//        Example:
//Secure URL: https://www.amazon.com/
//Input and Output Format:
//Refer sample input and output for formatting specifications.
//All text in bold corresponds to input and the rest corresponds to output.
//Sample Input and Output 1:
//Enter the string http://www.amazon.com/
//Enter the start string
//https "http://www.amazon.com/" does not start with "https"
//Sample Input and Output 2:
//Enter the string https://www.amazon.com/
//Enter the start string
//https "https://www.amazon.com/" starts with "https"

