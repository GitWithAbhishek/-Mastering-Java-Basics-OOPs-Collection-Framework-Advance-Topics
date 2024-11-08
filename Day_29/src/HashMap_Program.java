import java.util.HashMap;

public class HashMap_Program {
    public static void main(String[] args) {

        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // 1. Put (Insertion) - Adding key-value pairs
        map.put("Aman", 25);
        map.put("Naman", 30);
        map.put("Gaurav", 35);
        map.put("Sandeep", 40);
        System.out.println("HashMap after put operations: " + map);

        // 2. Get (Retrieval) - Retrieving a value by key
        Integer age = map.get("Aman");
        System.out.println("Age of Aman: " + age);

        // 3. Remove (Deletion) - Removing a key-value pair
        map.remove("Naman");
        System.out.println("HashMap after removing Naman: " + map);

        // 4. Contains Key/Value - Checking if a key or value exists
        boolean hasAman = map.containsKey("Aman");
        boolean hasAge40 = map.containsValue(40);
        System.out.println("Contains key 'Aman': " + hasAman);
        System.out.println("Contains value 40: " + hasAge40);

        // 5. Size - Checking the number of entries
        int size = map.size();
        System.out.println("Size of HashMap: " + size);

        // 6. Clear - Removing all entries
        map.clear();
        System.out.println("HashMap after clear operation: " + map);
    }
}

