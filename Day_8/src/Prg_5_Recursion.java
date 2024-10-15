import java.util.Scanner;

public class Prg_5_Recursion {
    static int factorial_fun(int num){
        if(num==0||num==1){
            return 1;
        }
        else{
            return (num*factorial_fun(num-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Recursive Function To Find Factorial");
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        int result;
        result=factorial_fun(num);
        System.out.println("The Factorial Is - "+result);

    }
}
