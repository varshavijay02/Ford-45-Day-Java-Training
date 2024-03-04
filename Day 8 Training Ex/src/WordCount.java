import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WordCount {
    public static void main(String[] args) {
        // Your code here
        Map<String, Integer> wordCountMap = new HashMap<>();
        try{
            File inputFile = new File("word_count_input.txt");
            Scanner sc = new Scanner(inputFile);
            while (sc.hasNext()){
                String word = sc.next().toLowerCase();
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0)+1);
            }
            sc.close();
            PrintWriter writer = new PrintWriter("word_count_output.txt");
            for(Map.Entry<String, Integer> entry : wordCountMap.entrySet()){
                writer.println(entry.getKey()+" : "+entry.getValue());
            }
            writer.close();
        }catch(FileNotFoundException fnfe){
            System.out.println("File Not Found!");
        }
    }
}

//Problem Statement-1
//Create a Java program to read a text file, count the occurrences of each word, and write the word count to a new file.
//Requirements:
//   - Read input text file.
//   - Perform word count.
//   - Write word count to a new file.
//
//Operations to Perform:
//   - Read file content.
//   - Tokenize and count words.
//   - Write word count to a new file.
//
//Code Stub:
//   import java.util.HashMap;
//   import java.util.Map;
//   import java.util.Scanner;
//   import java.io.File;
//   import java.io.FileNotFoundException;
//
//   public class WordCount {
//       public static void main(String[] args) {
//           // Your code here
//       }
//   }
//Sample Input:
//   Input File: sample.txt
//   This is a sample text file. The text file contains sample text.
//Sample Output:
//   Output File: word_count.txt
//   This: 1
//   is: 1
//   a: 1
//   sample: 2
//   text: 2
//   file: 2
//   The: 1
//   contains: 1
