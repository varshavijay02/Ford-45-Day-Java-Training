import java.io.*;
import java.util.Scanner;

public class BasicFileOperations {
    public static void main(String[] args) {
        // Implement the code here
        String filePath = "sample.txt";
        System.out.println("File exists: "+checkFileExistence(filePath)+"\n" +
                "File content: "+readFileContent(filePath) );
        writeFileContent(filePath, "Hello World");
        displayFileInfo(filePath);

    }

    private static boolean checkFileExistence(String filePath) {
        // Code to check file existence
        File file = new File(filePath);
        return file.exists();
    }

    private static String readFileContent(String filePath){
        // Code to read file content
        try {
            File file = new File(filePath);
            Scanner sc = new Scanner(file);
//        String fileContents = "";
            return sc.nextLine();
        }catch (FileNotFoundException fileNotFoundException){
            return "File Not Found!";
        }

    }

    private static void writeFileContent(String filePath, String content) {
        // Code to write content to file
        try {
            File file = new File("sample1.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(content);
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static void displayFileInfo(String filePath) {
        // Code to display file information
        File file = new File(filePath);
//        try{
        System.out.println("File Information:\n" +
                "Name: "+filePath+"\n" +
                "Size: "+file.length()+" bytes\n");
//        }catch (FileNotFoundException f){
//            System.out.println("File Not Found!");
//        }
    }
}

//   Create a Java program that performs basic file operations such as reading from a file, writing to a file, and checking file existence.
//
//Requirements:
//   - The program should take a file path as input.
//   - It should support both reading and writing to the file.
//   - Check if the file exists before performing any operations.
//
//Operations to Perform:
//   - Check if the file exists.
//   - Read content from the file.
//   - Write content to the file.
//   - Display the file information.
//
//Code Stub:
//   public class FileBasicOperations {
//       public static void main(String[] args) {
//           // Implement the code here
//       }
//
//       private static boolean checkFileExistence(String filePath) {
//           // Code to check file existence
//           return false;
//       }
//
//       private static String readFileContent(String filePath) {
//           // Code to read file content
//           return null;
//       }
//
//       private static void writeFileContent(String filePath, String content) {
//           // Code to write content to file
//       }
//
//       private static void displayFileInfo(String filePath) {
//           // Code to display file information
//       }
//   }
//   ```
//
//Sample Input:
//   Enter file path: input.txt
//
//Sample Output:
//   File exists: true
//   File content: Hello, this is a sample file.
//   File written successfully.
//   File Information:
//   Name: input.txt
//   Size: 1024 bytes
