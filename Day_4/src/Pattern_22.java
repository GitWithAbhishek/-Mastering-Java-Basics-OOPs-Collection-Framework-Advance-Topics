import java.util.Scanner;

public class Pattern_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rectangle Pattern");
        int bre,len;
        System.out.print("Enter the breadth - ");
        bre=sc.nextInt();
        System.out.print("Enter the length - ");
        len=sc.nextInt();
        for(int i=0;i<bre;i++){
            for(int j=0;j<len;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
