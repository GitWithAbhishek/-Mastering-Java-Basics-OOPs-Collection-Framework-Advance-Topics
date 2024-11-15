import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.Deque;

public class Queue_Class {

    public static void main(String[] args) {
        // PriorityQueue Example
        System.out.println("=== PriorityQueue Example ===");
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(15);
        priorityQueue.add(10);
        priorityQueue.add(20);
        System.out.println("PriorityQueue elements: " + priorityQueue);
        System.out.println("Polled element (smallest): " + priorityQueue.poll());
        System.out.println("PriorityQueue after poll: " + priorityQueue);

        // Deque Example with ArrayDeque
        System.out.println("\n=== ArrayDeque Example ===");
        Deque<String> deque = new ArrayDeque<>();

        // Adding elements
        deque.addFirst("Front");
        deque.addLast("Rear");
        deque.addLast("End");
        System.out.println("Deque elements: " + deque);

        // Accessing elements
        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());

        // Removing elements
        System.out.println("Removed first: " + deque.removeFirst());
        System.out.println("Removed last: " + deque.removeLast());
        System.out.println("Deque after removals: " + deque);

        // Using Deque as Stack
        System.out.println("\n=== Using Deque as Stack ===");
        deque.push("Element 1");
        deque.push("Element 2");
        System.out.println("Deque as Stack: " + deque);
        System.out.println("Popped from stack: " + deque.pop());
        System.out.println("Deque after pop: " + deque);
    }
}

