import java.util.Scanner;

public class Pattern_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        System.out.print("Enter The Length = ");
        len = sc.nextInt();
        for(int i=0;i<len;i++){
            for(int k=len-1;k>i;k--){
                System.out.print("  ");
            }
            for(int val=i+1;val<i*2+2;val++){
                System.out.print(val+" ");
            }
            for(int val =i*2 ; val>i;val--){
                System.out.print(val+" ");
            }
            System.out.println();

        }
    }
}
