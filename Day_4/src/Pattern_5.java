import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        System.out.print("Enter The Length = ");
        len = sc.nextInt();
        for (int i = 1; i <= len; i++) {
            char a = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            a = (char) (a - 2);
            for (int c = 2; c <= i; c++) {
                System.out.print(a + " ");
                a--;

            }
            System.out.println();
        }
    }
}
