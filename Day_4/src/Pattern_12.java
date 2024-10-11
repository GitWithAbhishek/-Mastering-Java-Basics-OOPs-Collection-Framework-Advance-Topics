import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        System.out.print("Enter The Length = ");
        len = sc.nextInt();
        for (int i = 0; i < len; i++) {
            //Outer Space
            for (int k = len; k > i; k--) {
                System.out.print(" ");
            }
            if (i == 0 || i == len - 1) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("* ");
                }

            } else {
                System.out.print("*");
                //inner spaces
                for (int k = 0; k < i * 2 - 1; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
