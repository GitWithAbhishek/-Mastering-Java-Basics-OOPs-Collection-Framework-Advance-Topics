import java.util.HashSet;

public class HashSet_Program {
    public static void main(String[] args) {
        System.out.println("Implementing HashSet");
        HashSet<Integer> hs = new HashSet<>(10,0.5f);
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        // Duplicate Elements Will Occur Once
        hs.add(5);
        System.out.println("Is 7 Present in hashset "+hs.contains(7));
        System.out.println("Is Hashset Is empty "+hs.isEmpty());
        System.out.println("Removing 3 From Hashset");
        hs.remove(3);
        System.out.println(hs);
        System.out.println("The Size Of HashSet Is "+hs.size());
        hs.clear();
        System.out.println("Now Hashset Is Fully Cleared "+hs);
    }
}
