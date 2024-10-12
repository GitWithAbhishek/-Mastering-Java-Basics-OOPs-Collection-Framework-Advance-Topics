import java.util.Scanner;

public class Prg_1_Initialization_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Methods To Declare A One D Array");
        // Method 1
        // Declaration + Memory Allocation
        int [] arr = new int[5];
        // Initialization
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;

        // Method 2
        // Declaration + Initialization
        int [] brr = {1,2,3,4,5,6,7,8,9,10};

        // Array Length
        System.out.println("The Length Of The Array arr is - "+arr.length);
        System.out.println("The Length Of The Array brr is - "+brr.length);

        // Accessing Array Elements Using For Loop
        System.out.println("Elements Of arr Array ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Elements Of brr Array ");
        for(int i=0;i<brr.length;i++){
            System.out.print(brr[i]+" ");
        }
        System.out.println();

        // Initialization Elements Of Array Using For Loop
        System.out.println("Enter The Elements In The New Array crr");
        int [] crr = new int [10];
        for(int i=0;i<10;i++){
            crr[i]=sc.nextInt();
        }
        System.out.println("The Elements You Entered in Crr Array ");
        for(int i=0;i<crr.length;i++){
            System.out.print(crr[i]+" ");
        }

    }
}
