import java.util.Scanner;

public class Pattern_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        System.out.print("Enter The Length = ");
        len = sc.nextInt();
        for (int i = 1; i < len + 1; i++) {
            int c = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                ;
                if (i > 1 && c < i) {
                    System.out.print("*");
                    c++;
                }
            }
            System.out.println();
            ;
        }
        for (int i = len; i > 0; i--) {
            int c = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (i > 1 && c < i) {
                    System.out.print("*");
                    c++;
                }
            }
            System.out.println();
        }
    }
}
