import java.util.Scanner;

public class Pattern_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        System.out.print("Enter The Length = ");
        len = sc.nextInt();
        for(int i=len;i>0;i--){
            for(int k=len;k>i;k--){
                System.out.print("  ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*   ");
            }
            System.out.println();

        }
    }
}
