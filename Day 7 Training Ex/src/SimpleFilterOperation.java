import java.util.*;
import java.util.stream.Collectors;

@FunctionalInterface
interface FilterCondition {
    boolean test(int number);
}

class FilterOperation {
    public static List<Integer> filterList(List<Integer> numbers, FilterCondition condition) {
        // Implement filtering logic using lambda expressions
        return  numbers.stream().filter(condition::test).collect(Collectors.toList());
    }
}

public class SimpleFilterOperation {
    public static void main(String[] args) {
        // Test the filterList method with a sample input
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        FilterCondition condition = number -> number%2==0; // Define the condition using lambda expression

        List<Integer> filteredList = FilterOperation.filterList(numbers, condition);
        System.out.println("Filtered List = " + filteredList);

    }
}

//Problem 1: Simple Filter Operation
//Implement a program that filters a list of integers based on a given condition using lambda expressions and functional interfaces.
//Requirements: Create a functional interface for the condition, a method to filter the list, and a class to test the functionality.
//Operations to Perform: Define a functional interface, implement a method to filter using lambda expressions, and test it with a sample list.
//Code Stub:
//interface FilterCondition {
//    boolean test(int number);
//}
//
//class FilterOperation {
//    public static List<Integer> filterList(List<Integer> numbers, FilterCondition condition) {
//        // Implement filtering logic using lambda expressions
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        // Test the filterList method with a sample input
//    }
//}
//Sample Input:
//List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//FilterCondition condition = // Define the condition using lambda expression
//Sample Output:
//Filtered List: [2, 4, 6, 8, 10]
