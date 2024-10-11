import java.util.Scanner;

public class Pattern_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        System.out.print("Enter The Length = ");
        len = sc.nextInt();
        for(int i=1;i<len+1;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();;
        }
    }
}
