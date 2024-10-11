import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len;
        System.out.println("Enter the length = ");
        len= sc.nextInt();
        for(int i=1;i<=len;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=(len-i)*2;k>=0;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=len;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            for(int k=(len-i)*2;k>=0;k--){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
