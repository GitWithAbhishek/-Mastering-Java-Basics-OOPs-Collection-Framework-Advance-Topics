import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer> lkl = new LinkedList<Integer>();
        //Adding Elements Directly
        lkl.add(10);
        lkl.add(20);
        lkl.add(30);
        lkl.add(40);
        lkl.add(50);
        //Adding Element At Specific Location
        lkl.add(1,15);
        lkl.add(3,25);
        lkl.add(5,35);
        lkl.add(7,45);
        lkl.add(9,55);
        lkl.add(10,60);
        // Extending The LinkedList
        LinkedList<Integer> lkl2 = new LinkedList<Integer>();
        lkl2.add(65);
        lkl2.add(70);
        lkl2.add(75);
        lkl2.add(80);
        lkl2.add(85);
        lkl2.add(90);
        lkl2.add(95);
        lkl2.add(100);

        // Extending Lkl And Lkl2
        lkl.addAll(lkl2);

        // Printing LinkedList
        for(int i=0;i<lkl.size();i++){
            System.out.print(lkl.get(i)+" ");
        }

        System.out.println();

        // Checking For A Particular Value
        System.out.println("Is 65 In LinkedList "+lkl.contains(65));

        // Print Index Of Particular Value :- First Occurrence
        System.out.println("Index Of 85 IS "+lkl.indexOf(85));

        // Delete At Specific Index
        System.out.println("Removing index 5 and 8");
        lkl.remove(5);
        lkl.remove(8);

        // Adding Element At The First
        lkl.addFirst(1);

        // Adding Element At The End
        lkl.addLast(110);

        // Printing Linked List
        for(int i=0;i<lkl.size();i++){
            System.out.print(lkl.get(i)+" ");
        }

    }
}
