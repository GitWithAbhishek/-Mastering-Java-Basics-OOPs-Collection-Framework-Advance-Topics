import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_HashSet {
    public static void main(String[] args) {
        System.out.println("Implementing Linked Hashset :) ");
        System.out.println("Linked HashSet Maintain The Insertion Order");
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Aman");
        lhs.add("Naman");
        lhs.add("Sandeep");
        lhs.add("Anshumaan");
        //Now Printing The Linked HashSet LHS
        //There Are Two Methods Two Print The Linked Hashset
        //Method 1 (For Each)
        for(String s :lhs){
            System.out.print(s+" ");
        }
        System.out.println();
        //Method 2 (Using The Iterator)
        Iterator<String> i = lhs.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
    }
}
