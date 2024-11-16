import java.util.*;

public class Collections_Class {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 8, 1, 2));

        // 1. Sort the list in ascending order
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers); // Output: [1, 2, 3, 5, 8]

        // 2. Reverse the list
        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers); // Output: [8, 5, 3, 2, 1]

        // 3. Search for an element using binary search
        // Before searching, sort the list in ascending order again
        Collections.sort(numbers);
        int index = Collections.binarySearch(numbers, 3);
        if (index >= 0) {
            System.out.println("Element 3 found at index: " + index); // Output: Element 3 found at index: 2
        } else {
            System.out.println("Element not found!");
        }
    }
}
