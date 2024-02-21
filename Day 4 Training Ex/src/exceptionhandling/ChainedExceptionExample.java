package exceptionhandling;

public class ChainedExceptionExample {

    protected static void nullPointerGiver(){
        try{
            String str = null;
            System.out.println(str.length());
        }catch (NullPointerException npe){
            throw new ArithmeticException();
        }
    }

    public static void main(String[] args) {
        try{
//            System.out.println(10/0);
            nullPointerGiver();
        }catch (ArithmeticException ae){
            ae.printStackTrace();
        }
    }
}

//Problem 6: Chained Exceptions
//Develop a program that demonstrates the use of chained exceptions,
// where one exception is caused by another.
//
//Requirements:
//Cause one exception (NullPointerException) by another (ArithmeticException).
//
//Operations to Perform:
//Attempt a division by zero operation.
//Cause a NullPointerException during the exception handling.
//
//Code Stub:
//public class ChainedExceptionExample {
//    // Code goes here
//}
//
//Sample Input:
//Perform a division by zero operation.
//
//Sample Output:
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//    at ChainedExceptionExample.main(ChainedExceptionExample.java:10)
//Caused by: java.lang.NullPointerException
//    at ChainedExceptionExample.performDivision(ChainedExceptionExample.java:6)
//    at ChainedExceptionExample.main(ChainedExceptionExample.java:8)
