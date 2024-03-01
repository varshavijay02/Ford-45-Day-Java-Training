import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class StringConcatenation {
    public static String concatenateStrings(List<String> strings) {
        // Implement custom collector logic for string concatenation using Stream API and lambda expressions
        return strings.stream().collect(CustomCollectors.joining());
    }
}


class CustomCollectors {
    public static Collector<CharSequence, StringBuilder, String> joining() {
        return Collector.of(
                StringBuilder::new,         // Supplier - initialize the StringBuilder
                StringBuilder::append,      // Accumulator - append each string
                StringBuilder::append,      // Combiner - combine two StringBuilders
                StringBuilder::toString      // Finisher - convert StringBuilder to String
        );
    }
}


public class CustomCollectorForStringConcatenation {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", " ", "World", "!");
        System.out.println(StringConcatenation.concatenateStrings(strings));
    }
}

//Problem 7: Custom Collector for String Concatenation
//Create a program that concatenates strings in a list using a custom collector with the Stream API.
//Requirements: Implement a custom collector for string concatenation, a class to demonstrate the operation, and lambda expressions for processing.
//Operations to Perform: Implement the custom collector logic, use the Stream API, and test with a sample list of strings.
//Code Stub:
//class StringConcatenation {
//    public static String concatenateStrings(List<String> strings) {
//        // Implement custom collector logic for string concatenation using Stream API and lambda expressions
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        // Test the concatenateStrings method with a sample input
//    }
//}
//Sample Input:
//List<String> strings = Arrays.asList("Hello", " ", "World", "!");
//Sample Output:
//Concatenated String: "Hello World!"
