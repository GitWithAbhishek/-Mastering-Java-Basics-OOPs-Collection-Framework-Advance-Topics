import java.util.Scanner;

public class Pattern_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        System.out.print("Enter The Length = ");
        len = sc.nextInt();
        for(int i=0;i<len;i++){
            //space outside
            for(int k=len-1;k>i;k--){
                System.out.print(" ");
            }
            if(i==0||i==len-1){
                //inside space
                for(int j=0;j<i+1;j++){
                    System.out.print(j+1+" ");
                }
            }
            else{
                System.out.print("1");
                for(int k=0;k<i*2-1;k++){
                    System.out.print(" ");
                }
                System.out.print(i+1);

            }
            System.out.println();
        }
    }
}
