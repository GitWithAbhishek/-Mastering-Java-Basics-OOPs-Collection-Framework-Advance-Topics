import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        System.out.print("Enter The Length = ");
        len=sc.nextInt();
        for (int i = 0; i < len; i++) {
            for (int j = 3 + i; j > 2; j--) {
                System.out.print(i + 3);
            }
            System.out.println();
        }
        for (int i = len + 1; i > 2; i--) {
            for (int j = i; j > 2; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}