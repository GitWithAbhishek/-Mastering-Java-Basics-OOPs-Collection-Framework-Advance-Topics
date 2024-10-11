import java.util.Scanner;

public class Pattern_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        System.out.print("Enter The Length = ");
        len = sc.nextInt();
        for (int i = len; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                if (i == len || i == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("* ");
                    for (int k = i - 2; k > 0; k--) {
                        System.out.print("  ");
                    }
                    System.out.print("* ");
                    break;
                }
            }
            System.out.println();
        }
    }
}
