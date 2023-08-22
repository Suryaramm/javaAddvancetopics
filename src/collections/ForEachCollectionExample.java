package collections;

import java.util.ArrayList;
import java.util.List;

public class ForEachCollectionExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Using forEach loop to process each element
        fruits.forEach(fruit -> System.out.println(fruit));
    }
}

