import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface SumOperation {
    int sum(int num1, int num2);
}

class ReducingOperation {
    public static int sumList(List<Integer> numbers, SumOperation operation) {
        // Implement reduction logic using Stream API and lambda expressions
        return numbers.stream().reduce(0, (sum, num)->operation.sum(sum, num));
    }
}


public class ReducingOperationWithStreams {
    public static void main(String[] args) {
        // Test the sumList method with a sample input
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        SumOperation sumOperation = (num1, num2)->num1+num2;// Define the sum operation using lambda expression

        int sumOfList = ReducingOperation.sumList(numbers, sumOperation);
        System.out.println("Sum of List = " + sumOfList);

    }
}

//Problem 4: Reducing Operation with Streams
//Create a program that finds the sum of all elements in a list of integers using the reduce function in the Stream API.
//
//Requirements: Use the Stream API for reduction, a functional interface for the reduction logic, and a class to demonstrate the operation.
//
//Operations to Perform: Implement the reduction logic, use the Stream API to find the sum, and test with a sample list.
//
//Code Stub:
//interface SumOperation {
//    int sum(int num1, int num2);
//}
//
//class ReducingOperation {
//    public static int sumList(List<Integer> numbers, SumOperation operation) {
//        // Implement reduction logic using Stream API and lambda expressions
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        // Test the sumList method with a sample input
//    }
//}
//Sample Input:
//List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//SumOperation sumOperation = // Define the sum operation using lambda expression
//Sample Output:
//Sum of List: 15
