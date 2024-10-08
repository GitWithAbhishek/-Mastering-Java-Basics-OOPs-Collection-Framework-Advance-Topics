public class Prg_4_Type_Conversion {
    public static void main(String[] args) {
        int a=5;
        int b=2;
        float result;
        System.out.println("Implicit Type Conversion");
        result=a/b;
        System.out.println(result);
        System.out.println("Explicit Type Conversion");
        result=(float)a/b;
        System.out.println(result);

    }
}
