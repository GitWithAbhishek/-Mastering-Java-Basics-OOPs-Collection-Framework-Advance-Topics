import java.util.Scanner;

public class Pattern_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        System.out.print("Enter The Length = ");
        len = sc.nextInt();
        for(int i=1;i<len+1;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
