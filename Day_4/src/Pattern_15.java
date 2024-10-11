import java.util.Scanner;

public class Pattern_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        System.out.print("Enter The Length = ");
        len = sc.nextInt();
        for(int i= 1;i<=len;i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 1 || i == len) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("1 ");
                    for (int k = 2; k < i; k++) {
                        System.out.print("  ");
                    }
                    System.out.print(i);
                    break;
                }
            }
            System.out.println();
        }
    }
}
