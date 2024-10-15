public class Prg_3_Method_Overloading {
    static void add(){
        System.out.println("This Is Void Add Function");
    }
    static int add(int num1,int num2){
        return num1+num2;
    }
    static double add(double num1,double num2){
        return num1+num2;
    }
    static int add(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    public static void main(String[] args) {
        System.out.println("Method Overloading Can be done by Changing the method return type or by changing the number of Arguments");
        int result;
        double total;
        System.out.println("Void Add Function");
        add();
        System.out.println("Int Add Two Number Function");
        result=add(3,5);
        System.out.println(result);
        System.out.println("Double Add Function");
        total=add(2.344,6.544);
        System.out.println(total);
        System.out.println("Int Add Three Number Function");
        result=add(1,2,3);
        System.out.println(result);
    }
}
