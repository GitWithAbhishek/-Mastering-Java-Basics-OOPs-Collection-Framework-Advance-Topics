import java.util.Scanner;
public class Prg_2_Nested_If_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        System.out.println();
        int a=sc.nextInt();
        if(a>15) {
            System.out.println("You Are Eligible To Drive Non Gear Vehicle ");

            if (a > 18) {
                System.out.println("You Are Eligible to Vote");

                if (a > 26) {
                    System.out.println("You Are Eligible to Marriage");

                    if (a > 60) {
                        System.out.println("You Have To Retried For Your Working Company");

                    }
                }
            }
        }
        else{
            System.out.println("You Are To Young");
        }
    }
}
