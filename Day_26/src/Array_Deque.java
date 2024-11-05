import java.util.ArrayDeque;
public class Array_Deque {
    public static void main(String[] args) {
    ArrayDeque<Integer> Ardq = new ArrayDeque<Integer>();
        Ardq.add(1);
        Ardq.add(2);
        Ardq.add(3);
        Ardq.add(4);
        Ardq.add(5);
        // Alternate of add
        Ardq.offer(6);
        // Adding At The First
        Ardq.offerFirst(0);
        // Adding At The Last
        Ardq.offerLast(7);
        System.out.println("Printing The Array Deque");
        for(int i:Ardq){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("The Top Most Value is "+Ardq.peekFirst());
        System.out.println("The Bottom Most Value is "+Ardq.peekLast());
        System.out.println("Displaying And Removing The Top most Value "+Ardq.pollFirst());
        System.out.println("Displaying And Removing The Bottom most Value "+Ardq.pollLast());
        System.out.println("Printing The Updated Array Deque");
        for(int i:Ardq){
            System.out.print(i+" ");
        }
    }
}
