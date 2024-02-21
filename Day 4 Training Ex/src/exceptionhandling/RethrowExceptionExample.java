package exceptionhandling;

public class RethrowExceptionExample {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.print("Exception caught and rethrown: ");
            throw e;
        }
    }
}

//Problem 7: Rethrowing Exceptions
//Implement a program that rethrows an exception caught in a method.
//Requirements:
//Create a method that catches an exception and rethrows it.
//
//Operations to Perform:
//Catch an exception in a method.
//Rethrow the caught exception.
//
//Code Stub:
//public class RethrowExceptionExample {
//    // Code goes here
//}
//
//Sample Input:
//Perform an operation that throws an exception.
//
//Sample Output:
//Exception caught and rethrown: ...
