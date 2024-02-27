package file_operations_test;

import java.io.File;

public class FileProcessor {
    public String readFromFile(String filePath) {
        /* method implementation */
        File file = new File(
                "C:\\Users\\pankaj\\Desktop\\test.txt");
        return null;
    }
    public void writeToFile(String filePath, String data) {
        /* method implementation */
    }

}

//Problem 4: Testing File Operations
//Create JUnit tests for a FileProcessor class that reads and writes data to files.
//
//Requirements:
//- FileProcessor class with methods for reading and writing data.
//- JUnit test cases for file read and write operations.
//
//Operations to Perform:
//1. Read Data from File
//2. Write Data to File
//3. Handle File Not Found Exception
//4. Handle IOException
//
//Code Stub:
//public class FileProcessor {
//    public String readFromFile(String filePath) { /* method implementation */ }
//    public void writeToFile(String filePath, String data) { /* method implementation */ }
//}
//
//Sample Input:
//File Path: "data.txt"
//Data to Write: "Hello, World!"
//
//Sample Output:
//Read Data from File: "Hello, World!"
//Write Data to File: Successful
