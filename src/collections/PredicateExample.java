package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);

        // Define a predicate to filter even numbers
        Predicate<Integer> evenNumberPredicate = num -> num % 2 == 0;

        // Filter and print even numbers
        for (int num : numbers) {
            if (evenNumberPredicate.test(num)) {
                System.out.println(num + " is even");
            }
        }
    }
}

