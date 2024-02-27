package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BasicMapOperations {
    public static void main(String[] args) {
        Map map = new HashMap();
        Scanner sc = new Scanner(System.in);
        String key1 = sc.nextLine();
        String value1 = sc.nextLine();
        String key2 = sc.nextLine();
        int value2 = sc.nextInt();
        sc.nextLine();
        map.put(key1, value1);
        map.put(key2, value2);
        System.out.println("Remove:");
        String remKey = sc.nextLine();
//        Integer removed = map.remove(remKey);
        System.out.println(!map.remove(remKey).equals(0)?"removed sucessfully.":"unsucessful removal");
        System.out.println("find:");
        String keyFind = sc.nextLine();
        boolean isKeyPresent = map.containsKey(keyFind);
        System.out.println("Key \""+keyFind+"\" "+(isKeyPresent?"exists.":"doesn't exist."));

    }
}

//Problem 1: Basic Map Operations
//Implement a basic Java program to demonstrate the usage of a HashMap.
// The program should allow users to add, remove, and retrieve key-value pairs.
//Operations to Perform:
//   - Add a key-value pair to the map
//   - Remove a key-value pair from the map
//   - Retrieve the value associated with a given key
//   - Check if a key exists in the map
//   - Display all key-value pairs in the map
//
//Code Stub:
//    import java.util.HashMap;
//    import java.util.Map;
//
//    public class BasicMapOperations {
//        public static void main(String[] args) {
//            // TODO: Implement basic map operations
//        }
//    }
//Sample Input:
//   1. Add key="name", value="John"
//   2. Add key="age", value=25
//   3. Retrieve value for key="name"
//   4. Remove key="age"
//   5. Check if key="city" exists
//
//Sample Output:
//   1. Key-value pair added successfully.
//   2. Key-value pair added successfully.
//   3. Value for key "name": John
//   4. Key-value pair removed successfully.
//   5. Key "city" does not exist in the map.
