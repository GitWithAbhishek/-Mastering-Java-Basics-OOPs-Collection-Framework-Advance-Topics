import java.util.Scanner;

public class Prg_2_Two_D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Creating A Two D Array");
        // Method 1
        // Declaration + Memory Allocation
        int [][] arr = new int[2][2];
        // Initialization
        arr[0][0]=1;
        arr[0][1]=2;
        arr[1][0]=3;
        arr[1][1]=4;

        // Method 2
        // Declaration + Initialization
        int [][] brr = {{1,2,3},{4,5,6},{7,8,9}};

        // Accessing Array Elements Using For Loop
        System.out.println("Elements Of arr Array ");
        for(int i=0;i<2;i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Elements Of brr Array ");
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Initialization Elements Of 2 D Array Using For Loop
        System.out.println("Enter The Elements In The New Array crr");
        int [][] crr = new int [3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            crr[i][j]=sc.nextInt();
        }
            }
        // Accessing Elements Of 2 D Array Using For Loop
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(crr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
