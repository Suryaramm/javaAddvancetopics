package collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Creating a HashSet to store unique numbers
        Set<Integer> numbers = new HashSet<>();

        // Adding elements to the set
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(10);  // Duplicate element, will not be added

        // Checking if an element exists in the set
        boolean containsFive = numbers.contains(5);
        System.out.println("Contains 5: " + containsFive);

        // Iterating through the set
        System.out.println("All numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Removing an element
        numbers.remove(10);
        System.out.println("After removing 10: " + numbers);
    }
}

