import java.util.Scanner;

public class Prg_3_Else_if {
    public static void main(String[] args) {
        System.out.println("Enter Your Marks : ");
        Scanner sc=new Scanner(System.in);
        int marks= sc.nextInt();
        if(marks>=90&&marks<=100){
            System.out.println("You Got A Grade");
        }
        else if(marks>=80&&marks<90){
            System.out.println("You Got B Grade");
        }
        else if(marks>=70&&marks<80){
            System.out.println("You Got C Grade");
        }
        else if(marks>=60&&marks<70){
            System.out.println("You Got D Grade");
        }
        else{
            System.out.println("You Scored Very Less You Got E Grade");
        }

    }
}
