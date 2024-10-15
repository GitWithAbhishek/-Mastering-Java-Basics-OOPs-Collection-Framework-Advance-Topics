public class Prg_1_Void_Type_Function {
    static void fun(){
        System.out.println("This Is A Void Function");
    }
    static void fun2(int a,int b){
        System.out.println("The Value Of A is "+a+" The Value Of B is "+b);
    }
    public static void main(String[] args) {
        //Calling a void function (Without Arguments)
        fun();
        //Calling a void function (With Arguments)
        fun2(2,4);

    }
}
