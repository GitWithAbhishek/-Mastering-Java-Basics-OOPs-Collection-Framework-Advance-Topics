public class Practice_Set_Error_Handling {
    public static void main(String[] args) {
        // 1- WAP To Demonstrate Syntax,Logical And Runtime Errors

        // int a = 7  Syntax Error (; missing)
        int age=72;
       // int born_year = 2024; // Logical Error
        // System.out.println(6/0);  // Runtime Error

        // 2- WAP To Print Haha Arithmetic Exception During And Hee During Illegal Argument Exception
        try{
            int a= 66/0;

        }
        catch(IllegalArgumentException e){
            System.out.println("Hee");
        }
        catch (ArithmeticException e){
            System.out.println("Haha");
        }

        // 3- WAP which allow you to access the array element until valid index comes otherwise show error
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<11;i++){
            try{
                System.out.print(arr[i]+" ");
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Error");
            }
        }

    }
}
