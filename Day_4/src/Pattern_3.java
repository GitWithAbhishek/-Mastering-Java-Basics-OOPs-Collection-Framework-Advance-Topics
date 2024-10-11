import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        System.out.println("Enter The Length = ");
        len = sc.nextInt();
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (i > 1) {
                    System.out.print("*" + i);
                    j++;
                }
            }
            System.out.println();
        }
    }
}