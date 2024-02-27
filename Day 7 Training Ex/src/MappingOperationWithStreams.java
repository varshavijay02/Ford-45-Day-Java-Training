import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface SquareOperation {
    int square(int number);
}

class MappingOperation {
    public static List<Integer> squareList(List<Integer> numbers, SquareOperation operation) {
        // Implement mapping logic using Stream API and lambda expressions
        return numbers.stream().map(operation::square).collect(Collectors.toList());

    }
}

public class MappingOperationWithStreams {
    public static void main(String[] args) {
        // Test the squareList method with a sample input
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        SquareOperation squareOperation = number -> number*number; // Define the square operation using lambda expression

        List<Integer> squaredList = MappingOperation.squareList(numbers, squareOperation);
        System.out.println("Squared List = " + squaredList);

    }
}

//Problem 2: Mapping Operation with Streams
//Create a program that squares each element of a list of integers using the map function in the Stream API.
//
//Requirements: Use the Stream API for mapping, a functional interface for the mapping logic, and a class to demonstrate the operation.
//
//Operations to Perform: Implement the mapping logic, use the Stream API to square each element, and test with a sample list.
//
//Code Stub:
//interface SquareOperation {
//    int square(int number);
//}
//
//class MappingOperation {
//    public static List<Integer> squareList(List<Integer> numbers, SquareOperation operation) {
//        // Implement mapping logic using Stream API and lambda expressions
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        // Test the squareList method with a sample input
//    }
//}
//Sample Input
//List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//SquareOperation squareOperation = // Define the square operation using lambda expression
//Sample Output:
//Squared List: [1, 4, 9, 16, 25]
