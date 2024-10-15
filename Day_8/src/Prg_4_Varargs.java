public class Prg_4_Varargs {
    static void varargs_fun(int...arr){
    int sum=0;
    for(int a:arr){
        sum=sum+a;
    }
        System.out.println("The Total Sum is "+sum);
    }
    public static void main(String[] args) {
        System.out.println("Now Using Varargs We Can Pass Any Number Of Arguments");
        varargs_fun(1,2,3,4,5,6,7,8,9);
    }
}
