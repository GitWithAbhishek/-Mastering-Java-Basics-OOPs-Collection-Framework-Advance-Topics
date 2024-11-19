import java.util.ArrayList;
import java.util.Iterator;
public class Iterator_Java {
    public static void main(String[] args) {
        // Create a list
        ArrayList<String> names = new ArrayList<>();
        names.add("Aman");
        names.add("Naman");
        names.add("Sandeep");

        // Create an iterator
        Iterator<String> iterator = names.iterator();

        // Iterate through the list
        System.out.println("Using Iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

