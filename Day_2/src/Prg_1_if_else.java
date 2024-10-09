import java.util.Scanner;
public class Prg_1_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Two Numbers To Compare Using All Types Of Comparision Operator ");
        System.out.println();
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b){
            System.out.println("Both Are Equals");
        }
        if(a<b){
            System.out.println("A is Less Than B");
        }
        if(a>b){
            System.out.println("B Is Greater Than A");
        }
        else{
            System.out.println("Wrong Input");
        }
    }
}
