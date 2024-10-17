import java.util.InputMismatchException;
import java.util.Scanner;

public class Prg_3_Nested_try_catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First Number - ");
        int num1 = sc.nextInt();
        System.out.print("Enter The Second Number - ");
        int num2 = sc.nextInt();
        try{
            int result=num1/num2;
            System.out.println("The Result Is "+result);
            System.out.print("Enter The Digit");
            try{
                int d= sc.nextInt();
                System.out.println("All Try Are Verified");
            }
            catch(InputMismatchException e){
                System.out.println("Wrong Input "+e);
                System.out.println("Level 2 Catch Encounter");
            }
        }
        catch(ArithmeticException e){
            System.out.println("Division Is Not Possible "+e);
            System.out.println("Level 1 Catch Encounter");
        }
    }
}
