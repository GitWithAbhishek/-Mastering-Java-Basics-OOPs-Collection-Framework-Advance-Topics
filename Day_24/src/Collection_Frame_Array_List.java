import java.util.ArrayList;

public class Collection_Frame_Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        //Adding Elements Directly
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        //Adding Element At Specific Location
        arr.add(1,15);
        arr.add(3,25);
        arr.add(5,35);
        arr.add(7,45);
        arr.add(9,55);
        arr.add(10,60);
        // Extending The ArrayList
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        arr2.add(65);
        arr2.add(70);
        arr2.add(75);
        arr2.add(80);
        arr2.add(85);
        arr2.add(90);
        arr2.add(95);
        arr2.add(100);

        // Extending Arr And Arr2
        arr.addAll(arr2);

        // Printing ArrayList
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }

        System.out.println();
        
        // Checking For A Particular Value
        System.out.println("Is 65 In ArrayList "+arr.contains(65));

        // Print Index Of Particular Value :- First Occurrence
        System.out.println("Index Of 85 IS "+arr.indexOf(85));

        // Delete At Specific Index
        System.out.println("Removing index 5 and 8");
        arr.remove(5);
        arr.remove(8);

        // Printing Array List
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }

    }
}
