package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Creating a LinkedList to simulate a queue
        Queue<String> taskQueue = new LinkedList<>();

        // Adding elements to the queue
        taskQueue.offer("Task 1");
        taskQueue.offer("Task 2");
        taskQueue.offer("Task 3");

        // Removing and processing elements in FIFO order
        while (!taskQueue.isEmpty()) {
            String task = taskQueue.poll();
            System.out.println("Processing: " + task);
        }
    }
}
