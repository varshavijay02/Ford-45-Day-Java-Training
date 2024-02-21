package exceptionhandling;

import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String errorMessage){
        super(errorMessage);
    }
}

public class CustomExceptionExample {
    protected static void validateAge(int age) throws InvalidAgeException {
        if(age<0 || age>150){
            throw new InvalidAgeException("Age must be between 0 and 150.");
        }else{
            System.out.println("You are probably a human");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");


        try{
            int age = sc.nextInt();
            validateAge(age);
        }catch (InvalidAgeException ageEx){
            System.out.println("InvalidAgeException: "+ageEx.getMessage());
        }catch (Exception e){
            System.out.println("Error: "+e);
        }
    }
}

//Problem 3: Custom Exception
//Develop a custom exception class named InvalidAgeException to handle situations where
// age is less than 0 or greater than 150.
//
//Requirements:
//Use a custom exception class (InvalidAgeException).
//Handle situations where age is invalid.
//
//Operations to Perform:
//Check if age is within a valid range.
//Throw InvalidAgeException if the age is invalid.
//
//Code Stub:
//public class CustomExceptionExample {
//    // Code goes here
//}
//
//Sample Input:
//Enter age: -5
//
//Sample Output:
//InvalidAgeException: Age must be between 0 and 150.
