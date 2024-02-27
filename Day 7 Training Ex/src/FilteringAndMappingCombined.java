import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface FilterCondition2 {
    boolean test(int number);
}
@FunctionalInterface
interface SquareOperation2 {
    int square(int number);
}

class CombinedOperation {
    public static List<Integer> filterAndSquareList(List<Integer> numbers, FilterCondition2 condition, SquareOperation2 operation) {
        // Implement combined filtering and mapping logic using lambda expressions and Stream API
        return numbers.stream().filter(condition::test).map(operation::square).collect(Collectors.toList());
    }
}

public class FilteringAndMappingCombined {
    public static void main(String[] args) {
        // Test the filterAndSquareList method with a sample input
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        FilterCondition2 condition = number -> number%2==0;// Define the condition using lambda expression
        SquareOperation2 squareOperation = number -> number*number; // Define the square operation using lambda expression

        List<Integer> filterAndSquareList = CombinedOperation.filterAndSquareList(numbers, condition, squareOperation);
        System.out.println("Filtered and Squared List = " + filterAndSquareList);

    }
}

//Problem 3: Filtering and Mapping Combined
//Implement a program that filters and squares each element of a list of integers using lambda expressions and the Stream API.
//Requirements: Combine filtering and mapping operations, use functional interfaces for both, and demonstrate the functionality in a class.
//
//Operations to Perform: Implement filtering and mapping logic using lambda expressions and Stream API, and test with a sample list.
//
//Code Stub:
//interface FilterCondition {
//    boolean test(int number);
//}
//
//interface SquareOperation {
//    int square(int number);
//}
//
//class CombinedOperation {
//    public static List<Integer> filterAndSquareList(List<Integer> numbers, FilterCondition condition, SquareOperation operation) {
//        // Implement combined filtering and mapping logic using lambda expressions and Stream API
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        // Test the filterAndSquareList method with a sample input
//    }
//}
//
//Sample Input:
//List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//FilterCondition condition = // Define the condition using lambda expression
//SquareOperation squareOperation = // Define the square operation using lambda expression
//Sample Output:
//Filtered and Squared List: [4, 16, 36, 64, 100]
