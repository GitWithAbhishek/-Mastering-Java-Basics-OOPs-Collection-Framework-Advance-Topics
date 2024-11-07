import java.util.Iterator;
import java.util.TreeSet;
public class Tree_Set {
    public static void main(String[] args) {
        System.out.println("Implementing The Tree Set :)");
        System.out.println("TreeSet Maintain The Sorting Order Means Elements Are Arranged in The Sorted Form ");
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(4);
        //Now Printing The TreeSet
        // There Are Two Methods Two Print The TreeSet
        //Method 1 (For Each)
        for(Integer i :treeSet){
            System.out.print(i+" ");
        }
        System.out.println();
        //Method 2 (Using The Iterator)
        Iterator<Integer> it = treeSet.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
