import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

interface SquareOperation3 {
    int square(int number);
}

class ParallelProcessing {
    public static int sumOfSquares(List<Integer> numbers, SquareOperation3 operation) {
        // Implement parallel processing logic using Stream API and lambda expressions
        return numbers.parallelStream()
                .mapToInt(operation::square)
                .sum();
    }
}


public class ParallelProcessingWithStreams {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 100) .boxed()
                .collect(Collectors.toList());// Generate a large list of integers
        SquareOperation3 squareOperation = number->number*number;// Define the square operation using lambda expression

        long startTime = System.currentTimeMillis();
        int sumOfSquares = ParallelProcessing.sumOfSquares(numbers, squareOperation);
        long endTime = System.currentTimeMillis();

        System.out.println("Sum of Squares: " + sumOfSquares);
        System.out.println("Time taken: " + (endTime - startTime) + " ms");

    }
}

//Problem 6: Parallel Processing with Streams
//Implement a program that calculates the sum of squares for a large list of integers using parallel processing with the Stream API.
//Requirements: Use the parallelStream method, a functional interface for squaring, and a class to demonstrate the parallel processing.
//Operations to Perform: Implement the parallel processing logic, use the parallelStream method, and test with a large sample list.
//Code Stub:
//interface SquareOperation {
//    int square(int number);
//}
//
//class ParallelProcessing {
//    public static int sumOfSquares(List<Integer> numbers, SquareOperation operation) {
//        // Implement parallel processing logic using Stream API and lambda expressions
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        // Test the sumOfSquares method with a large sample input
//    }
//}
//Sample Input:
//List<Integer> numbers = // Generate a large list of integers
//SquareOperation squareOperation = // Define the square operation using lambda expression
//Sample Output:
//Sum of Squares: // Result of the sum of squares using parallel processing
