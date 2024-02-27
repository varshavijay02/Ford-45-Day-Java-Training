import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class CategorizingStrings {
    public static Map<Boolean, List<String>> categorizeStrings(List<String> strings) {
        // Implement categorization logic using Stream API, lambda expressions, and groupingBy collector
        Predicate<String> startsWithVowel = s -> "aeiou".contains(String.valueOf(s.toLowerCase().charAt(0)));

        return strings.stream().collect(Collectors.groupingBy(startsWithVowel::test));
    }
}


public class GroupingByPredicateWithCollectors {
    public static void main(String[] args) {
        // Test the categorizeStrings method with a sample input
        List<String> strings = Arrays.asList("apple", "banana", "orange", "pear", "grape");
        Map<Boolean, List<String>> categorizedStrings = CategorizingStrings.categorizeStrings(strings);
        System.out.println("Categorized Strings = " + categorizedStrings);
    }
}

//Problem 5: Grouping by Predicate with Collectors
//Implement a program that groups a list of strings into two categories: those starting with a vowel and those starting with a consonant.
//
//        Requirements: Use the Stream API with groupingBy collector, predicates for categorization, and a class to demonstrate the operation.
//Operations to Perform: Implement the categorization logic using lambda expressions, Stream API, and groupingBy collector, and test with a sample list of strings.
//Code Stub:
//class CategorizingStrings {
//    public static Map<Boolean, List<String>> categorizeStrings(List<String> strings) {
//        // Implement categorization logic using Stream API, lambda expressions, and groupingBy collector
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        // Test the categorizeStrings method with a sample input
//    }
//}
//Sample Input:
//List<String> strings = Arrays.asList("apple", "banana", "orange", "pear", "grape");
//Sample Output:
//Categorized Strings: {false=[banana, grape], true=[apple, orange, pear]}

