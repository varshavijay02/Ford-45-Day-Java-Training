import java.util.Scanner;

public class Compare2Integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int x = sc.nextInt();
        System.out.println("Enter the second number");
        int y = sc.nextInt();
        System.out.println(x+(x>y?" is greater than ":(x==y? " is equal to " : " is lesser than "))+y);
    }
}
//Write a program to relate 2 integers entered by the user as equal to, less than or greater than.
//
//Input and Output Format:
//Input consists of 2 integers.
//Refer sample input and output for formatting specifications.
//All text in bold corresponds to input and the rest corresponds to output.
//
//Sample Input and Output 1:
//Enter the first number
//6
//Enter the second number
//8
//6 is less than 8
//
//Sample Input and Output 2:
//Enter the first number
//8
//Enter the second number
//6
//8 is greater than 6
//
//Sample Input and Output 3:
//Enter the first number
//8
//Enter the second number
//8
//8 is equal to 8

