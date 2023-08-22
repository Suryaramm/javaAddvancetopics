package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Creating a HashMap to store person names and ages
        Map<String, Integer> personAges = new HashMap<>();

        // Adding key-value pairs
        personAges.put("Alice", 30);
        personAges.put("Bob", 25);
        personAges.put("Charlie", 28);

        // Accessing values using keys
        int aliceAge = personAges.get("Alice");
        System.out.println("Alice's age: " + aliceAge);

        // Iterating through the map
        System.out.println("All persons and their ages:");
        for (Map.Entry<String, Integer> entry : personAges.entrySet()) {
            String person = entry.getKey();
            int age = entry.getValue();
            System.out.println(person + ": " + age);
        }

        // Removing a key-value pair
        personAges.remove("Bob");
        System.out.println("After removing Bob: " + personAges);
    }
}

