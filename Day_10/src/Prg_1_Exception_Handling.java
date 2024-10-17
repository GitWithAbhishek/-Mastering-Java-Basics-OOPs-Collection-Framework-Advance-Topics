import java.util.Scanner;

public class Prg_1_Exception_Handling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Here We Are Going To Use Try Catch Block");
        // Start 1
        // Simple Try Catch Block Code To Handle Any Kind Of Exception
        int a=40;
        int b=0;
        try{
            int result=a/b;
            System.out.println("No Exception Came During Solving The Expression "+result);
        }
        catch(Exception e){
            System.out.println(e);
        }
        // End 1

        // Start 2
        // Handling Specific Type Of Exception
        System.out.println("Here We Are Going To Handle Specific Exception ");
        try{
            System.out.print("Enter The First Number - ");
            int c= sc.nextInt();
            System.out.print("Enter The Second Number - ");
            int d= sc.nextInt();

            int result=c/d;
            System.out.println("You Have Given Correct Input");
            System.out.println("And The Result is - "+result);
        }
        catch(ArithmeticException e){
            System.out.println("Worng Input "+e);
        }
        catch (Exception e){
            System.out.println("Here Any Exception "+e);
        }

    }
}
