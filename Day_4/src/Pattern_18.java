import java.util.Scanner;

public class Pattern_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        System.out.print("Enter The Length = ");
        len = sc.nextInt();
        for(int i=len;i>0;i--){
            for(int j=1;j<i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
