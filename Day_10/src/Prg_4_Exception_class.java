import java.util.Scanner;
class MyException extends Exception {
    @Override
    public String toString() {
        return "I Am toString";
    }

    @Override
    public String getMessage() {
        return "I Am getMessage";
    }
}
public class Prg_4_Exception_class{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=sc.nextInt();
        if(a>9){
            try{
                throw new MyException();
            }
            catch(MyException e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();

            }
        }
        else {
            System.out.println("The input number is less than or equal to 9, no exception thrown.");
        }
    }

}
