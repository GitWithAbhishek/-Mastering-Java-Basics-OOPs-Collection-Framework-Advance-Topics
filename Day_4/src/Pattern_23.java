import java.util.Scanner;

public class Pattern_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        System.out.print("Enter The Length = ");
        len=sc.nextInt();
        //half solid pyramid
        for(int i=1;i<len+1;i++){
            //Outer space
            for(int k=len;k>i;k--){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //half inverted solid pyramid
        for(int i=len;i>0;i--){
            //Outer space
            for(int k=len;k>i;k--){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    }

