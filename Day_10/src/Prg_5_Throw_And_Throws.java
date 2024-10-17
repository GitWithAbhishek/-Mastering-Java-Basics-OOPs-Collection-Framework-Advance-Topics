class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius Can't Be Negative";
    }

    @Override
    public String getMessage() {
        return "Enter Positive Radius";
    }
}
public class Prg_5_Throw_And_Throws {
    public static int divide(int a, int b)throws ArithmeticException{
        return a/b;
    }
    public static double area(int r)throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result=3.14*r*r;
        return result;
    }
    public static void main(String[] args) {
        //Divide
        try{
            int c=divide(6,2);
            System.out.println("The Ans Is "+c);
        }
        catch(ArithmeticException e){
            System.out.println("Exception "+e);
        }
        //Radius
        try{
            double ar=area(-3);
            System.out.println("The Area Of The Circle Is "+ar);
        }
        catch(Exception e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}
