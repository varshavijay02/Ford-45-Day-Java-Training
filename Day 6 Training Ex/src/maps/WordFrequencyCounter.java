package maps;

import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        System.out.print("Enter a sentence: ");
        String[] sentence = sc.nextLine().split(" ");
        for(String word: sentence){
            String newWord;
            if(word.charAt(word.length()-1)=='.'){
                newWord = word.substring(0,word.length()-1);
            }else{
                newWord=word;
            }
            if(map.containsKey(newWord)){
                map.put(newWord, map.get(newWord)+1);
            }
            else{
                map.put(newWord, 1);
            }
        }
        System.out.println("Word frequencies:");
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        Collections.sort(entryList, Collections.reverseOrder(Map.Entry.comparingByValue()));
        for(Map.Entry<String, Integer> entry: entryList){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }


    }
}

//Problem 2: Frequency Counter
//Create a Java program that takes a sentence as input and uses a HashMap
// to count the frequency of each word in the sentence.
//Operations to Perform:
//   - Tokenize the input sentence into words
//   - Use a HashMap to count the frequency of each word
//   - Display the word frequencies in descending order
//
//Code Stub:
//    import java.util.HashMap;
//    import java.util.Map;
//
//    public class WordFrequencyCounter {
//        public static void main(String[] args) {
//            // TODO: Implement word frequency counter
//        }
//    }
//Sample Input:
//   Enter a sentence: "This is a sample sentence. This sentence is for testing."
//
//Sample Output:
//   Word frequencies:
//   - sentence: 2
//   - this: 2
//   - is: 2
//   - a: 1
//   - sample: 1
//   - for: 1
//   - testing: 1
