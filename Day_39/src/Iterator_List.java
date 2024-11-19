import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator_List {
    public static void main(String[] args) {
        // Create a list
        ArrayList<String> names = new ArrayList<>();
        names.add("Aman");
        names.add("Naman");
        names.add("Sandeep");

        // Create a ListIterator
        ListIterator<String> listIterator = names.listIterator();

        // Forward traversal
        System.out.println("Traversing forward:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Backward traversal
        System.out.println("Traversing backward:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
