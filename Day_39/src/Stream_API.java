import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_API {
    public static void main(String[] args) {
        // Create a list of numbers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Filter even numbers and collect them into a new list
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        // Print all numbers using forEach
        System.out.println("All Numbers:");
        numbers.stream().forEach(System.out::println);
    }
}
