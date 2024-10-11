import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        System.out.print("Enter The Length = ");
        len = sc.nextInt();
        for(int i=0;i<len;i++){
            for(int k=i;k<len-1;k++){
                System.out.print("  ");
            }
            for(int j=0;j<i+1;j++){
                //Taking too many space acc to desired output
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}
