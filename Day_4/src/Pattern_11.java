import java.util.Scanner;

public class Pattern_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        System.out.print("Enter The Length = ");
        len = sc.nextInt();
        //Half Hollow Pyramid
        for(int i=0;i<len;i++){
            //Outer Space
            for(int k=len-1;k>i;k--){
                System.out.print(" ");
            }
            if(i==0){
                for(int j=0;j<=i;j++){
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("*");
                for(int k=0;k<i*2-1;k++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        //inverted hollow diamond
        for(int i=len;i>0;i--){
            //Outer Space
            for(int k=len;k>i;k--){
                System.out.print(" ");
            }
            if(i==1){
                System.out.print("*");
            }
            else{
                System.out.print("*");
                for(int j=1;j<i*2-2;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
