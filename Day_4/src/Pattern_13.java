import java.util.Scanner;

public class Pattern_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        System.out.print("Enter The Length = ");
        len = sc.nextInt();
        int line_count=1;
        for(int i=1;i<=len;i++){
            System.out.print(i+" ");
            for(int j=i+1;j<=len;j++){
                if(i==len||i==1){
                    System.out.print(j+" ");
                }
                else{
                    for(int k=(len-i)*2-2;k>0;k--){
                        System.out.print(" ");
                    }
                    System.out.print(len);
                    break;
                }
            }
            System.out.println();
        }
    }
}
