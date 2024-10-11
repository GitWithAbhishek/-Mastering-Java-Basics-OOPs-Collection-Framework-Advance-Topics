import java.util.Scanner;

public class Pattern_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        System.out.print("Enter The Length = ");
        len = sc.nextInt();
        for (int i = 0; i < len; i++) {
            for (int j = len; j > i; j--) {
                System.out.print("* ");
            }
            for (int k = 0; k < i * 2; k++) {
                System.out.print("  ");
            }
            for (int j = len; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < len + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            for (int k = (len - i) * 2; k > 0; k--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            ;

        }
    }
}
