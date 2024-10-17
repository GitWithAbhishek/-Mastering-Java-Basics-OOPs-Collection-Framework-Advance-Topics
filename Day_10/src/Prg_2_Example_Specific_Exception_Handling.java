import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Prg_2_Example_Specific_Exception_Handling {
    public static void main(String[] args) {
        System.out.println("Here We Are going To See Array Out Of Bound, Arithmetic , Input Exception");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number First - ");
        int a = sc.nextInt();
        System.out.print("Enter Number First - ");
        int b= sc.nextInt();
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        try{
            int d=a/b;
            System.out.println("The Result Of The Division Is - "+d);
            System.out.print("Enter The Index Value Of The Array You Are Searching For - ");
            int c= sc.nextInt();
            System.out.println("The value is - "+arr[c]);
        }
        // ArithmeticException: Division by zero
        catch(ArithmeticException e){
            System.out.println("Division Is Not Possible Due To "+e);
        }
        // InputMismatchException: Wrong Input Entered
        catch(InputMismatchException e){
            System.out.println("Wrong Input Type Value Entered "+e);
        }
        // ArrayIndexOutOfBoundsException: Accessing an invalid index
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index Value Doesn't Exist "+e);
        }
        // Exception: Handle every Type Of Exception
        catch(Exception e){
            System.out.println("Exception Occured "+e);
        }
    }
}
