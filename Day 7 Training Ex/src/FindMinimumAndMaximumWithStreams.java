import java.util.Arrays;
import java.util.List;
import java.util.Map;

class MinMaxFinder {
    public static Map<String, Integer> findMinMax(List<Integer> numbers) {
        // Implement logic to find minimum and maximum using Stream API and lambda expressions
        Integer max = numbers.stream().max(Integer::compareTo).orElse(Integer.MIN_VALUE);
        Integer min = numbers.stream().min(Integer::compareTo).orElse(Integer.MAX_VALUE);

        return Map.of("Max", max, "Min", min);
    }
}


public class FindMinimumAndMaximumWithStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 4);
        System.out.println(MinMaxFinder.findMinMax(numbers));
    }
}

//Problem 8: Find Minimum and Maximum with Streams
//Implement a program that finds the minimum and maximum elements from a list of integers using the Stream API.
//Requirements: Use the Stream API with min and max functions, a class to demonstrate the operation, and lambda expressions for processing.
//Operations to Perform: Implement logic to find the minimum and maximum using Stream API, lambda expressions, and test with a sample list of integers.
//Code Stub:
//class MinMaxFinder {
//    public static Map<String, Integer> findMinMax(List<Integer> numbers) {
//        // Implement logic to find minimum and maximum using Stream API and lambda expressions
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        // Test the findMinMax method with a sample input
//    }
//}
//Sample Input:
//List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 4);
//Sample Output:
//Minimum and Maximum: {min=1, max=9}
