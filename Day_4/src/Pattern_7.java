import java.util.Scanner;

public class Pattern_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        System.out.print("Enter The Length = ");
        len = sc.nextInt();
        for(int i=1;i<=len;i++){
            int c=1;
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
                c=c*(i-j)/j;
            }
            System.out.println();

        }
    }
}
