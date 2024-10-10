public class Prg_3_For_Loop {
    public static void main(String[] args) {
        System.out.println("We Are Going To Print Hello India Five Times");
        for(int i=0;i<5;i++){
            System.out.println("Hello India");
        }
        /*
We Are Going To Print This Pattern Using While
*
* *
* * *
* * * *
* * * * *
 */
        for(int i=1;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
