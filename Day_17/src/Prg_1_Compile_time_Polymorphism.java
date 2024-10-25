class Overloading_Poly {
    public void fun(){

        System.out.println("No Variable Is Initialized");
        }
    public void fun(int a){
        System.out.println("The Value of A is "+a);
    }
    public void fun(int a, int b){
        System.out.println("The Value Of A and B Is "+a+" "+b);
    }


}
public class Prg_1_Compile_time_Polymorphism {

    public static void main(String[] args) {
        Overloading_Poly obj=new Overloading_Poly();
        System.out.println("The Code Shows Method Overloading");
        obj.fun();
        obj.fun(5);
        obj.fun(5,10);

    }
}