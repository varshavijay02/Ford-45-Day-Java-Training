package exceptionhandling;

import java.util.Arrays;
import java.util.Scanner;

public class MultipleExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        try{
            int[] numbers = new int[10];
            String[] splited = str.split(" ");
            for(int i=0;i<splited.length;i++){
                numbers[i] = Integer.parseInt(splited[i]);
            }
            System.out.println("numbers = " + Arrays.toString(numbers));
        }catch(NumberFormatException nfe){
            System.out.println("Error: Invalid input. Please provide a valid integer.");
        }catch (ArrayIndexOutOfBoundsException aibe){
            System.out.println("Error: Invalid input. Please provide <= 10 numbers");
        }
    }
}

//Problem 2: Multiple Exception Handling
//Create a Java program to handle both NumberFormatException and ArrayIndexOutOfBoundsException
// when parsing an integer from command line arguments.
//
//Requirements:
//Parse an integer from command line arguments.
//Handle both NumberFormatException and ArrayIndexOutOfBoundsException.
//
//Operations to Perform:
//Parse integer from command line arguments.
//Implement exception handling for the specified exceptions.
//
//Code Stub:
//public class MultipleExceptionHandling {
//    public static void main(String[] args) {
//        // Code goes here
//    }
//}
//
//Sample Input:
//java MultipleExceptionHandling abc
//
//Sample Output:
//Error: Invalid input. Please provide a valid integer.
